package androidx.media3.p132b.p133a;

import com.google.common.base.C58913w;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.media3.b.a.u */
/* compiled from: PG */
public final class C2476u implements C2474s {

    /* renamed from: a */
    public static final C2476u f6810a = new C2476u(Collections.emptyMap());

    /* renamed from: b */
    public final Map f6811b;

    /* renamed from: c */
    private int f6812c;

    public C2476u() {
        this(Collections.emptyMap());
    }

    /* renamed from: d */
    private static boolean m6525d(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public final long mo5905a() {
        byte[] bArr = (byte[]) this.f6811b.get("exo_len");
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return -1;
    }

    /* renamed from: b */
    public final String mo5906b() {
        byte[] bArr = (byte[]) this.f6811b.get("exo_redir");
        if (bArr != null) {
            return new String(bArr, C58913w.f156754c);
        }
        return null;
    }

    /* renamed from: c */
    public final C2476u mo5909c(C2475t tVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f6811b);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(tVar.f6809b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(tVar.f6808a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(C58913w.f156754c);
            } else if (value2 instanceof byte[]) {
                bArr = (byte[]) value2;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        if (m6525d(this.f6811b, hashMap)) {
            return this;
        }
        return new C2476u(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return m6525d(this.f6811b, ((C2476u) obj).f6811b);
    }

    public final int hashCode() {
        int i = this.f6812c;
        if (i != 0) {
            return i;
        }
        int i2 = 0;
        for (Map.Entry entry : this.f6811b.entrySet()) {
            i2 += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
        }
        this.f6812c = i2;
        return i2;
    }

    public C2476u(Map map) {
        this.f6811b = Collections.unmodifiableMap(map);
    }
}
