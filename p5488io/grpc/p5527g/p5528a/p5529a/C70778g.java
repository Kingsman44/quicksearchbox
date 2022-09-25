package p5488io.grpc.p5527g.p5528a.p5529a;

import com.evernote.android.state.BuildConfig;
import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import p5589m.C71831h;
import p5589m.C71832i;

/* renamed from: io.grpc.g.a.a.g */
/* compiled from: PG */
final class C70778g {

    /* renamed from: a */
    public static final C71832i f188740a = C71831h.m105170a(":");

    /* renamed from: b */
    public static final C70775d[] f188741b = {new C70775d(C70775d.f188723e, C71831h.m105170a(BuildConfig.FLAVOR)), new C70775d(C70775d.f188720b, C71831h.m105170a("GET")), new C70775d(C70775d.f188720b, C71831h.m105170a("POST")), new C70775d(C70775d.f188721c, C71831h.m105170a("/")), new C70775d(C70775d.f188721c, C71831h.m105170a("/index.html")), new C70775d(C70775d.f188722d, C71831h.m105170a("http")), new C70775d(C70775d.f188722d, C71831h.m105170a("https")), new C70775d(C70775d.f188719a, C71831h.m105170a("200")), new C70775d(C70775d.f188719a, C71831h.m105170a("204")), new C70775d(C70775d.f188719a, C71831h.m105170a("206")), new C70775d(C70775d.f188719a, C71831h.m105170a("304")), new C70775d(C70775d.f188719a, C71831h.m105170a("400")), new C70775d(C70775d.f188719a, C71831h.m105170a("404")), new C70775d(C70775d.f188719a, C71831h.m105170a("500")), new C70775d("accept-charset", (String) BuildConfig.FLAVOR), new C70775d("accept-encoding", "gzip, deflate"), new C70775d("accept-language", (String) BuildConfig.FLAVOR), new C70775d("accept-ranges", (String) BuildConfig.FLAVOR), new C70775d("accept", (String) BuildConfig.FLAVOR), new C70775d("access-control-allow-origin", (String) BuildConfig.FLAVOR), new C70775d("age", (String) BuildConfig.FLAVOR), new C70775d("allow", (String) BuildConfig.FLAVOR), new C70775d("authorization", (String) BuildConfig.FLAVOR), new C70775d("cache-control", (String) BuildConfig.FLAVOR), new C70775d("content-disposition", (String) BuildConfig.FLAVOR), new C70775d("content-encoding", (String) BuildConfig.FLAVOR), new C70775d("content-language", (String) BuildConfig.FLAVOR), new C70775d("content-length", (String) BuildConfig.FLAVOR), new C70775d("content-location", (String) BuildConfig.FLAVOR), new C70775d("content-range", (String) BuildConfig.FLAVOR), new C70775d("content-type", (String) BuildConfig.FLAVOR), new C70775d("cookie", (String) BuildConfig.FLAVOR), new C70775d("date", (String) BuildConfig.FLAVOR), new C70775d("etag", (String) BuildConfig.FLAVOR), new C70775d("expect", (String) BuildConfig.FLAVOR), new C70775d("expires", (String) BuildConfig.FLAVOR), new C70775d("from", (String) BuildConfig.FLAVOR), new C70775d("host", (String) BuildConfig.FLAVOR), new C70775d("if-match", (String) BuildConfig.FLAVOR), new C70775d("if-modified-since", (String) BuildConfig.FLAVOR), new C70775d("if-none-match", (String) BuildConfig.FLAVOR), new C70775d("if-range", (String) BuildConfig.FLAVOR), new C70775d("if-unmodified-since", (String) BuildConfig.FLAVOR), new C70775d("last-modified", (String) BuildConfig.FLAVOR), new C70775d("link", (String) BuildConfig.FLAVOR), new C70775d("location", (String) BuildConfig.FLAVOR), new C70775d("max-forwards", (String) BuildConfig.FLAVOR), new C70775d("proxy-authenticate", (String) BuildConfig.FLAVOR), new C70775d("proxy-authorization", (String) BuildConfig.FLAVOR), new C70775d("range", (String) BuildConfig.FLAVOR), new C70775d("referer", (String) BuildConfig.FLAVOR), new C70775d("refresh", (String) BuildConfig.FLAVOR), new C70775d("retry-after", (String) BuildConfig.FLAVOR), new C70775d("server", (String) BuildConfig.FLAVOR), new C70775d("set-cookie", (String) BuildConfig.FLAVOR), new C70775d("strict-transport-security", (String) BuildConfig.FLAVOR), new C70775d("transfer-encoding", (String) BuildConfig.FLAVOR), new C70775d("user-agent", (String) BuildConfig.FLAVOR), new C70775d("vary", (String) BuildConfig.FLAVOR), new C70775d("via", (String) BuildConfig.FLAVOR), new C70775d("www-authenticate", (String) BuildConfig.FLAVOR)};

    /* renamed from: c */
    public static final Map f188742c;

    static {
        C71832i iVar = C71832i.f191357a;
        int i = 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61);
        while (true) {
            C70775d[] dVarArr = f188741b;
            int length = dVarArr.length;
            if (i < 61) {
                if (!linkedHashMap.containsKey(dVarArr[i].f188724f)) {
                    linkedHashMap.put(dVarArr[i].f188724f, Integer.valueOf(i));
                }
                i++;
            } else {
                f188742c = Collections.unmodifiableMap(linkedHashMap);
                return;
            }
        }
    }

    /* renamed from: a */
    public static void m103511a(C71832i iVar) {
        int b = iVar.mo63094b();
        int i = 0;
        while (i < b) {
            byte a = iVar.mo63093a(i);
            if (a < 65 || a > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(iVar.mo63097d()));
            }
        }
    }
}
