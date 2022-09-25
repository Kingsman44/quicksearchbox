package com.android.p257c.p258a.p259a.p260a;

import android.hardware.radio.ProgramSelector;
import android.net.Uri;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.android.c.a.a.a.b */
/* compiled from: PG */
public final class C5036b {

    /* renamed from: a */
    public static final Map f15913a = new HashMap();

    /* renamed from: b */
    public static final Map f15914b = new HashMap();

    static {
        new DecimalFormat("###.#");
        C5035a aVar = C5035a.f15912a;
        aVar.accept(1, "AMFM_FREQUENCY");
        aVar.accept(2, "RDS_PI");
        aVar.accept(3, "HD_STATION_ID_EXT");
        aVar.accept(10004, "HD_STATION_NAME");
        aVar.accept(5, "DAB_SID_EXT");
        aVar.accept(6, "DAB_ENSEMBLE");
        aVar.accept(7, "DAB_SCID");
        aVar.accept(8, "DAB_FREQUENCY");
        aVar.accept(9, "DRMO_SERVICE_ID");
        aVar.accept(10, "DRMO_FREQUENCY");
        aVar.accept(12, "SXM_SERVICE_ID");
        aVar.accept(13, "SXM_CHANNEL");
    }

    /* renamed from: b */
    public static Uri m13838b(ProgramSelector programSelector) {
        ProgramSelector.Identifier primaryId = programSelector.getPrimaryId();
        String c = m13839c(primaryId.getType());
        if (c == null) {
            return null;
        }
        Uri.Builder appendPath = new Uri.Builder().scheme("broadcastradio").authority("program").appendPath(c).appendPath(m13840d(primaryId));
        for (ProgramSelector.Identifier identifier : programSelector.getSecondaryIds()) {
            String c2 = m13839c(identifier.getType());
            if (c2 != null) {
                appendPath.appendQueryParameter(c2, m13840d(identifier));
            }
        }
        return appendPath.build();
    }

    /* renamed from: d */
    private static String m13840d(ProgramSelector.Identifier identifier) {
        long value = identifier.getValue();
        int type = identifier.getType();
        if (type == 1 || type == 8 || type == 10 || type == 13) {
            return Long.toString(value);
        }
        return "0x".concat(String.valueOf(Long.toHexString(value)));
    }

    /* renamed from: a */
    public static ProgramSelector m13837a(long j) {
        if (j >= 0 && j <= 2147483647L) {
            return ProgramSelector.createAmFmSelector(-1, (int) j);
        }
        throw new IllegalArgumentException("illegal frequency value: " + j);
    }

    /* renamed from: c */
    private static String m13839c(int i) {
        if (i < 1000 || i > 1999) {
            return (String) f15913a.get(Integer.valueOf(i));
        }
        StringBuilder sb = new StringBuilder("VENDOR_");
        sb.append(i - 1000);
        return sb.toString();
    }
}
