package p5488io.grpc;

import com.google.common.base.C58827ar;
import com.google.common.base.C58838bb;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: io.grpc.at */
/* compiled from: PG */
public final class C70156at {

    /* renamed from: a */
    static final C58827ar f187006a = C58827ar.m90818c(',');

    /* renamed from: b */
    public static final C70156at f187007b = new C70156at(C70908w.f189099a, false, new C70156at(new C70907v(), true, new C70156at()));

    /* renamed from: c */
    public final byte[] f187008c;

    /* renamed from: d */
    private final Map f187009d;

    public C70156at() {
        this.f187009d = new LinkedHashMap(0);
        this.f187008c = new byte[0];
    }

    /* renamed from: a */
    public final C70154ar mo61729a(String str) {
        C70155as asVar = (C70155as) this.f187009d.get(str);
        if (asVar != null) {
            return asVar.f187004a;
        }
        return null;
    }

    private C70156at(C70154ar arVar, boolean z, C70156at atVar) {
        String c = arVar.mo61728c();
        C58838bb.m90869d(!c.contains(","), "Comma is currently not allowed in message encoding");
        int size = atVar.f187009d.size();
        LinkedHashMap linkedHashMap = new LinkedHashMap(!atVar.f187009d.containsKey(arVar.mo61728c()) ? size + 1 : size);
        for (C70155as asVar : atVar.f187009d.values()) {
            String c2 = asVar.f187004a.mo61728c();
            if (!c2.equals(c)) {
                linkedHashMap.put(c2, new C70155as(asVar.f187004a, asVar.f187005b));
            }
        }
        linkedHashMap.put(c, new C70155as(arVar, z));
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        this.f187009d = unmodifiableMap;
        C58827ar arVar2 = f187006a;
        HashSet hashSet = new HashSet(unmodifiableMap.size());
        for (Map.Entry entry : unmodifiableMap.entrySet()) {
            if (((C70155as) entry.getValue()).f187005b) {
                hashSet.add((String) entry.getKey());
            }
        }
        this.f187008c = arVar2.mo56097d(Collections.unmodifiableSet(hashSet)).getBytes(Charset.forName("US-ASCII"));
    }
}
