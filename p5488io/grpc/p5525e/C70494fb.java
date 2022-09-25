package p5488io.grpc.p5525e;

import com.google.common.base.C58838bb;
import com.google.p386ak.p394d.C8385a;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: io.grpc.e.fb */
/* compiled from: PG */
public final class C70494fb {

    /* renamed from: a */
    private static final Logger f187876a = Logger.getLogger(C70494fb.class.getName());

    private C70494fb() {
    }

    /* renamed from: a */
    public static Object m102938a(String str) {
        String str2;
        String str3;
        String str4;
        C8385a aVar = new C8385a(new StringReader(str));
        try {
            return m102939b(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e) {
                str2 = "io.grpc.internal.JsonParser";
                str3 = "parse";
                str4 = "Failed to close";
                f187876a.logp(Level.WARNING, str2, str3, str4, e);
            }
        }
    }

    /* renamed from: b */
    private static Object m102939b(C8385a aVar) {
        C58838bb.m90884s(aVar.mo17125p(), "unexpected end of JSON");
        int r = aVar.mo17127r() - 1;
        boolean z = true;
        if (r == 0) {
            aVar.mo17119j();
            ArrayList arrayList = new ArrayList();
            while (aVar.mo17125p()) {
                arrayList.add(m102939b(aVar));
            }
            if (aVar.mo17127r() != 2) {
                z = false;
            }
            C58838bb.m90884s(z, "Bad token: ".concat(aVar.mo17113d(false)));
            aVar.mo17121l();
            return Collections.unmodifiableList(arrayList);
        } else if (r == 2) {
            aVar.mo17120k();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (aVar.mo17125p()) {
                linkedHashMap.put(aVar.mo17115f(), m102939b(aVar));
            }
            if (aVar.mo17127r() != 4) {
                z = false;
            }
            C58838bb.m90884s(z, "Bad token: ".concat(aVar.mo17113d(false)));
            aVar.mo17122m();
            return Collections.unmodifiableMap(linkedHashMap);
        } else if (r == 5) {
            return aVar.mo17117h();
        } else {
            if (r == 6) {
                return Double.valueOf(aVar.mo17109a());
            }
            if (r == 7) {
                return Boolean.valueOf(aVar.mo17126q());
            }
            if (r == 8) {
                aVar.mo17123n();
                return null;
            }
            throw new IllegalStateException("Bad token: ".concat(aVar.mo17113d(false)));
        }
    }
}
