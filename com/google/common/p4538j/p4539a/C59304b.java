package com.google.common.p4538j.p4539a;

import com.google.protobuf.C62957cd;

/* renamed from: com.google.common.j.a.b */
/* compiled from: PG */
public enum C59304b implements C62957cd {
    TEL(0),
    SMS(1),
    CALLTO(2),
    WTAI(3),
    RTSP(4),
    MARKET(5),
    GEO(6),
    SKYPE(7),
    WHATSAPP(8),
    ITMS(20),
    ITMS_BOOKS(9),
    GLASS(10),
    ITMS_APPS(11),
    ITMS_APPSS(19),
    ITMS_SERVICES(22),
    GOOGLEASSISTANT(12),
    ASSISTANT_SETTINGS(13),
    SSH(14),
    INTENT(15),
    SIP(16),
    GOOGLEHOME(17),
    CHROMECAST(18),
    PAY(21),
    GOOGLEAPP(23),
    CID(24),
    WEBCAL(25);
    

    /* renamed from: A */
    private final int f157464A;

    private C59304b(int i) {
        this.f157464A = i;
    }

    public final int getNumber() {
        return this.f157464A;
    }

    public final String toString() {
        return Integer.toString(this.f157464A);
    }
}
