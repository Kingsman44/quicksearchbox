package com.google.android.apps.gsa.staticplugins.bisto.p7510o;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.p10712d.C142419eq;
import com.google.android.p10712d.C142421es;
import com.google.android.p10712d.C142424ev;
import com.google.android.p10712d.C142425ew;
import com.google.android.p10712d.C142427ey;
import com.google.android.p10712d.C142432fc;
import com.google.android.p10712d.C142434fe;
import com.google.android.p10712d.C142440fk;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import java.io.IOException;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.aa */
/* compiled from: PG */
public final class C95710aa {

    /* renamed from: a */
    public static final C59071e f267964a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.o.aa");

    /* renamed from: b */
    private static final C58495hd f267965b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(1, 2);
        gzVar.mo55429h(2, 3);
        gzVar.mo55429h(3, 4);
        gzVar.mo55429h(4, 5);
        gzVar.mo55429h(5, 6);
        f267965b = gzVar.mo55427f(false);
    }

    /* renamed from: a */
    public static String m158487a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(String.format("%02x ", new Object[]{Byte.valueOf(bArr[i])}));
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m158488b(byte[] bArr, C124548d dVar) {
        C142421es esVar;
        String str;
        String str2;
        int i;
        String str3;
        String str4;
        int i2;
        Integer num;
        Integer num2 = null;
        try {
            esVar = (C142421es) C62942bv.parseFrom((C62942bv) C142421es.f386450h, bArr);
        } catch (IOException e) {
            C59104x c = f267964a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15208)).mo56386p("Error parsing received LogFatal proto");
            esVar = null;
        }
        if (esVar != null) {
            str3 = esVar.f386452a;
            i = esVar.f386453b;
            str2 = m158487a(esVar.f386454c.mo59174N());
            str = m158487a(esVar.f386455d.mo59174N());
        } else {
            str3 = null;
            str2 = null;
            str = null;
            i = 0;
        }
        if (dVar != null) {
            i2 = dVar.mo106514l().f344111g;
            str4 = dVar.mo106472M();
        } else {
            str4 = null;
            i2 = 0;
        }
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[9];
        objArr[0] = Integer.valueOf(i2);
        objArr[1] = str4;
        objArr[2] = str3;
        objArr[3] = Integer.valueOf(i);
        objArr[4] = str2;
        objArr[5] = str;
        if (esVar == null) {
            num = null;
        } else {
            num = Integer.valueOf(esVar.f386456e);
        }
        objArr[6] = num;
        objArr[7] = esVar == null ? null : Integer.valueOf(esVar.f386457f);
        if (esVar != null) {
            num2 = Integer.valueOf(esVar.f386458g);
        }
        objArr[8] = num2;
        return String.format(locale, "Device crashed : dev=%d, label=%s, file=%s, line=%d, registers=<%s>, stack=<%s>, reset_source=%d, panic_code=%d, fault_code=%d", objArr);
    }

    /* renamed from: c */
    public static String m158489c(byte[] bArr) {
        C142425ew ewVar;
        try {
            ewVar = (C142425ew) C62942bv.parseFrom((C62942bv) C142425ew.f386461t, bArr);
        } catch (IOException e) {
            C59104x c = f267964a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15209)).mo56386p("Error parsing received health packet proto");
            ewVar = null;
        }
        String str = BuildConfig.FLAVOR;
        if (ewVar != null) {
            if ((ewVar.f386463a & 1) != 0) {
                Object[] objArr = new Object[2];
                objArr[0] = 1;
                int a = C142424ev.m231081a(ewVar.f386464b);
                objArr[1] = (a == 0 || a == 1) ? "UNKNOWN" : a != 2 ? a != 3 ? "SINGULAR" : "RIGHT" : "LEFT";
                str = str.concat(String.format("%s:%s,", objArr));
            }
            if ((ewVar.f386463a & 2) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{2, Integer.valueOf(ewVar.f386465c)}));
            }
            if ((ewVar.f386463a & 4) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{3, Integer.valueOf(ewVar.f386466d)}));
            }
            if ((ewVar.f386463a & 8) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{4, Integer.valueOf(ewVar.f386467e)}));
            }
            if ((ewVar.f386463a & 16) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{5, Integer.valueOf(ewVar.f386468f)}));
            }
            if ((ewVar.f386463a & 32) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{6, Integer.valueOf(ewVar.f386469g)}));
            }
            if ((ewVar.f386463a & 64) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{7, Integer.valueOf(ewVar.f386470h)}));
            }
            if ((ewVar.f386463a & 128) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{8, Integer.valueOf(ewVar.f386471i)}));
            }
            if ((ewVar.f386463a & 256) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{9, Integer.valueOf(ewVar.f386472j)}));
            }
            if ((ewVar.f386463a & 512) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{10, Integer.valueOf(ewVar.f386473k)}));
            }
            if ((ewVar.f386463a & 1024) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{11, Integer.valueOf(ewVar.f386474l)}));
            }
            if ((ewVar.f386463a & 2048) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{12, Integer.valueOf(ewVar.f386475m)}));
            }
            if ((ewVar.f386463a & 4096) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{13, Integer.valueOf(ewVar.f386476n)}));
            }
            if ((ewVar.f386463a & 8192) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{14, Integer.valueOf(ewVar.f386477o)}));
            }
            if ((ewVar.f386463a & 16384) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{15, Integer.valueOf(ewVar.f386478p)}));
            }
            if ((ewVar.f386463a & 32768) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{16, Integer.valueOf(ewVar.f386479q)}));
            }
            if ((ewVar.f386463a & 65536) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{17, Integer.valueOf(ewVar.f386480r)}));
            }
            if ((ewVar.f386463a & C89885b.S3REQUEST_VALUE) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{18, Integer.valueOf(ewVar.f386481s)}));
            }
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return String.format(Locale.getDefault(), "HP:{%s}", new Object[]{str});
    }

    /* renamed from: d */
    public static String m158490d(byte[] bArr) {
        C142427ey eyVar;
        try {
            eyVar = (C142427ey) C62942bv.parseFrom((C62942bv) C142427ey.f386482g, bArr);
        } catch (IOException e) {
            C59104x c = f267964a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(15210)).mo56386p("Error parsing received health packet on connect proto");
            eyVar = null;
        }
        String str = BuildConfig.FLAVOR;
        if (eyVar != null) {
            if ((eyVar.f386484a & 1) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{1, eyVar.f386485b}));
            }
            if ((eyVar.f386484a & 2) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{2, Integer.valueOf(eyVar.f386486c)}));
            }
            if ((eyVar.f386484a & 4) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{3, Integer.valueOf(eyVar.f386487d)}));
            }
            if ((eyVar.f386484a & 8) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{4, Integer.valueOf(eyVar.f386488e)}));
            }
            if ((eyVar.f386484a & 16) != 0) {
                str = str.concat(String.format("%s:%s,", new Object[]{5, Integer.valueOf(eyVar.f386489f)}));
            }
            if (str.length() > 0) {
                str = str.substring(0, str.length() - 1);
            }
        }
        return String.format(Locale.getDefault(), "HPOC:{%s}", new Object[]{str});
    }

    /* renamed from: e */
    public static void m158491e(int i, byte[] bArr, C124548d dVar) {
        int i2 = 1;
        if (i == 1) {
            try {
                C142419eq eqVar = (C142419eq) C62942bv.parseFrom((C62942bv) C142419eq.f386443d, bArr);
                int a = C142432fc.m231082a(eqVar.f386446b);
                if (a != 0) {
                    i2 = a;
                }
                int f = m158492f(i2);
                if (f == 3) {
                    C58976aa aaVar = C58975e.f156826a;
                    int i3 = eqVar.f386447c;
                    String str = eqVar.f386445a;
                } else if (f == 4) {
                    C59104x b = f267964a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "DeviceLog");
                    ((C59052c) ((C59052c) b).mo56372aa(15215)).mo56395y("%d: %s", eqVar.f386447c, eqVar.f386445a);
                } else if (f == 5) {
                    C59104x d = f267964a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "DeviceLog");
                    ((C59052c) ((C59052c) d).mo56372aa(15216)).mo56395y("%d: %s", eqVar.f386447c, eqVar.f386445a);
                } else if (f != 6) {
                    C58976aa aaVar2 = C58975e.f156826a;
                    int i4 = eqVar.f386447c;
                    String str2 = eqVar.f386445a;
                } else {
                    C59104x c = f267964a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "DeviceLog");
                    ((C59052c) ((C59052c) c).mo56372aa(15217)).mo56395y("%d: %s", eqVar.f386447c, eqVar.f386445a);
                }
            } catch (IOException e) {
                C59104x c2 = f267964a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "DeviceLog");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(15218)).mo56386p("Error parsing LogData proto");
            }
        } else if (i == 2) {
            String b2 = m158488b(bArr, dVar);
            C59071e eVar = f267964a;
            C59104x c3 = eVar.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) c3).mo56372aa(15219)).mo56389s("%s", b2);
            C59104x c4 = eVar.mo56225c();
            c4.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) c4).mo56372aa(15220)).mo56386p("*** *** FATAL ERROR IN BISTO DEVICE *** ***");
        } else if (i == 8) {
            try {
                C142434fe feVar = (C142434fe) C62942bv.parseFrom((C62942bv) C142434fe.f386498f, bArr);
                C59104x b3 = f267964a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "DeviceLog");
                ((C59052c) ((C59052c) b3).mo56372aa(15221)).mo56361N("Minidump: overflow=%b, from_ram=%b, from_pskey=%b, buffer=<%s>, argbuffer=<%s>", Boolean.valueOf(feVar.f386500a), Boolean.valueOf(feVar.f386501b), Boolean.valueOf(feVar.f386502c), m158487a(feVar.f386503d.mo59174N()), m158487a(feVar.f386504e.mo59174N()));
            } catch (IOException e2) {
                C59104x c5 = f267964a.mo56225c();
                c5.mo56378ag(C58975e.f156826a, "DeviceLog");
                ((C59052c) ((C59052c) ((C59052c) c5).mo56382g(e2)).mo56372aa(15222)).mo56386p("Error parsing received minidump proto");
            }
        } else if (i == 4) {
            try {
                C142440fk fkVar = (C142440fk) C62942bv.parseFrom((C62942bv) C142440fk.f386515b, bArr);
                C58976aa aaVar3 = C58975e.f156826a;
                int i5 = fkVar.f386517a;
            } catch (IOException e3) {
                C59104x c6 = f267964a.mo56225c();
                c6.mo56378ag(C58975e.f156826a, "DeviceLog");
                ((C59052c) ((C59052c) ((C59052c) c6).mo56382g(e3)).mo56372aa(15224)).mo56386p("Error parsing received ProfilerEvent proto");
            }
        } else if (i == 11) {
            String c7 = m158489c(bArr);
            C59104x b4 = f267964a.mo56224b();
            b4.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) b4).mo56372aa(15211)).mo56389s("%s", c7);
        } else if (i == 10) {
            String d2 = m158490d(bArr);
            C59104x b5 = f267964a.mo56224b();
            b5.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) b5).mo56372aa(15212)).mo56389s("%s", d2);
        } else {
            C59104x c8 = f267964a.mo56225c();
            c8.mo56378ag(C58975e.f156826a, "DeviceLog");
            ((C59052c) ((C59052c) c8).mo56372aa(15225)).mo56387q("unhandled message type: %d", i);
        }
    }

    /* renamed from: f */
    public static int m158492f(int i) {
        C58495hd hdVar = f267965b;
        Integer valueOf = Integer.valueOf(i - 1);
        if (hdVar.containsKey(valueOf)) {
            return ((Integer) hdVar.get(valueOf)).intValue();
        }
        return 2;
    }
}
