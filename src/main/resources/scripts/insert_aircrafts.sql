CREATE TABLE aircraft_registry (
                                   icao_code VARCHAR(10) PRIMARY KEY,
                                   registration VARCHAR(20) NOT NULL,
                                   operator VARCHAR(100) NOT NULL,
                                   aircraft_type VARCHAR(100) NOT NULL,
                                   icao_type VARCHAR(10) NOT NULL,
                                   category_code VARCHAR(10) NOT NULL,
                                   tag1 VARCHAR(100),
                                   tag2 VARCHAR(100),
                                   tag3 VARCHAR(100),
                                   category_label VARCHAR(100),
                                   reference_link TEXT
);

INSERT INTO aircraft_registry (
    icao_code, registration, operator, aircraft_type, icao_type, category_code,
    tag1, tag2, tag3, category_label, reference_link
) VALUES
      ('4', 'FAC1282', 'Colombian Air Force', 'CASA C-295 M', 'C295', 'Mil',
       'Cargo', 'Tactical Transport', 'Marching Powder', 'Other Air Forces', 'https://w.wiki/8pa2'),

      ('8002CC', 'K3602', 'Indian Air Force', 'Embraer Legacy 600', 'E35L', 'Mil',
       'Cargo', 'Troop Transport', 'Touch The Sky With Glory', 'Other Air Forces', 'https://indianairforce.nic.in'),

      ('8002CD', 'K3603', 'Gov of India', 'Embraer Legacy 600', 'E35L', 'Gov',
       'Dictator Alert', 'Narendra Modi', 'Free And Fair Elections', 'Dictator Alert', 'https://data.dictatoralert.org/dictatorships'),

      ('8002F6', 'K5012', 'Indian Air Force', 'Boeing 737NG-BBJ', 'B737', 'Mil',
       'Tactical Airlift', 'Globemaster', 'Touch The Sky With Glory', 'Other Air Forces', 'https://indianairforce.nic.in'),

      ('8002F7', 'K5013', 'Indian Air Force', 'Boeing 737NG-BBJ', 'B737', 'Mil',
       'Tactical Airlift', 'Globemaster', 'Touch The Sky With Glory', 'Other Air Forces', 'https://indianairforce.nic.in'),

      ('8002FB', 'K5014', 'Indian Air Force', 'Boeing 737NG-BBJ', 'B737', 'Mil',
       'Tactical Airlift', 'Globemaster', 'Touch The Sky With Glory', 'Other Air Forces', 'https://indianairforce.nic.in');


select * from aircraft_registry;