package com.google.net.cronet.telemetry.p4729a;

import android.util.Log;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p3186j$.util.Set;

/* renamed from: com.google.net.cronet.telemetry.a.b */
/* compiled from: PG */
public final class C62726b {

    /* renamed from: a */
    public static final String f169428a = "b";

    /* renamed from: b */
    public static final Set f169429b = Set.CC.m71644of("CHLO", "SHLO", "SCFG", "REJ", "CETV", "PRST", "SCUP", "ALPN", "P256", "C255", "AESG", "CC20", "QBIC", "AFCW", "IFW5", "IFW6", "IFW7", "IFW8", "IFW9", "IFWA", "TBBR", "1RTT", "2RTT", "LRTT", "BBS1", "BBS2", "BBS3", "BBS4", "BBS5", "BBRR", "BBR1", "BBR2", "BBR3", "BBR4", "BBR5", "BBR9", "BBRA", "BBRB", "BBRS", "BBQ1", "BBQ2", "BBQ3", "BBQ5", "BBQ6", "BBQ7", "BBQ8", "BBQ9", "BBQ0", "RENO", "TPCC", "BYTE", "IW03", "IW10", "IW20", "IW50", "B2ON", "B2NA", "B2NE", "B2RP", "B2LO", "B2HR", "B2SL", "B2H2", "B2RC", "BSAO", "B2DL", "B201", "B202", "B203", "B204", "B205", "B206", "B207", "NTLP", "1TLP", "1RTO", "NRTO", "TIME", "ATIM", "MIN1", "MIN4", "MAD0", "MAD2", "MAD3", "1ACK", "AKD3", "AKDU", "AFFE", "AFF1", "AFF2", "SSLR", "NPRR", "2RTO", "3RTO", "4RTO", "5RTO", "6RTO", "CBHD", "NBHD", "CONH", "LFAK", "STMP", "EACK", "ILD0", "ILD1", "ILD2", "ILD3", "ILD4", "RUNT", "NSTP", "NRTT", "1PTO", "2PTO", "6PTO", "7PTO", "8PTO", "PTOS", "PTOA", "PEB1", "PEB2", "PVS1", "PAG1", "PAG2", "PSDA", "PLE1", "PLE2", "APTO", "ELDT", "RVCM", "TCID", "MPTH", "NCMR", "DFER", "NPCO", "BWRE", "BWMX", "BWID", "BWI1", "BWRS", "BWS2", "BWS3", "BWS4", "BWS5", "BWS6", "BWP0", "BWP1", "BWP2", "BWP3", "BWP4", "BWG4", "BWG7", "BWG8", "BWS7", "BWM3", "BWM4", "ICW1", "DTOS", "FIDT", "3AFF", "10AF", "MTUH", "MTUL", "NSLC", "NCHP", "NBPE", "X509", "X59R", "CHID", "VER ", "NONC", "NONP", "KEXS", "AEAD", "COPT", "CLOP", "ICSL", "MIBS", "MIUS", "ADE ", "IRTT", "TRTT", "SNI ", "PUBS", "SCID", "ORBT", "PDMD", "PROF", "CCRT", "EXPY", "STTL", "SFCW", "CFCW", "UAID", "XLCT", "QLVE", "PDP1", "PDP2", "PDP3", "PDP5", "QNZ2", "MAD", "IGNP", "SRWP", "ROWF", "ROWR", "GSR0", "GSR1", "GSR2", "GSR3", "NRES", "INVC", "GWCH", "YTCH", "ACH0", "RREJ", "CADR", "ASAD", "SRST", "CIDK", "CIDS", "RNON", "RSEQ", "PAD ", "EPID", "SNO0", "STK0", "CRT255", "CSCT");

    /* renamed from: c */
    public JSONObject f169430c = new JSONObject();

    public C62726b(String str) {
        if (!m94937b(str)) {
            try {
                this.f169430c = (JSONObject) new JSONTokener(str).nextValue();
            } catch (JSONException e) {
                Log.d(f169428a, String.format("Experimental options could not be parsed, using default values. Error: %s", new Object[]{e.getMessage()}));
            }
        }
    }

    /* renamed from: b */
    public static final boolean m94937b(String str) {
        return str == null || str.isEmpty();
    }

    /* renamed from: a */
    public final Object mo58626a(String str, String str2, Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            jSONObject = this.f169430c.getJSONObject(str);
        } catch (JSONException e) {
            Log.d(f169428a, String.format("Failed to get %s options: %s", new Object[]{str, e.getMessage()}));
            jSONObject = null;
        }
        if (jSONObject == null) {
            return obj;
        }
        try {
            return cls.cast(jSONObject.get(str2));
        } catch (ClassCastException | JSONException e2) {
            Log.d(f169428a, String.format("Failed to get %s options: %s", new Object[]{str2, e2.getMessage()}));
            return obj;
        }
    }
}
