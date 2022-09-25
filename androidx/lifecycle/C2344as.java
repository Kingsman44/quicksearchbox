package androidx.lifecycle;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import androidx.core.p094f.C1891d;
import androidx.savedstate.C4087c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.p5574b.C71548cy;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69514bd;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.lifecycle.as */
/* compiled from: PG */
public final class C2344as {

    /* renamed from: a */
    public static final Class[] f6543a = {Boolean.TYPE, boolean[].class, Double.TYPE, double[].class, Integer.TYPE, int[].class, Long.TYPE, long[].class, String.class, String[].class, Binder.class, Bundle.class, Byte.TYPE, byte[].class, Character.TYPE, char[].class, CharSequence.class, CharSequence[].class, ArrayList.class, Float.TYPE, float[].class, Parcelable.class, Parcelable[].class, Serializable.class, Short.TYPE, short[].class, SparseArray.class, Size.class, SizeF.class};

    /* renamed from: b */
    public final Map f6544b;

    /* renamed from: c */
    public final C4087c f6545c;

    /* renamed from: d */
    private final Map f6546d;

    /* renamed from: e */
    private final Map f6547e;

    /* renamed from: f */
    private final Map f6548f;

    public C2344as() {
        this.f6546d = new LinkedHashMap();
        this.f6544b = new LinkedHashMap();
        this.f6547e = new LinkedHashMap();
        this.f6548f = new LinkedHashMap();
        this.f6545c = new C2341ap(this);
    }

    /* renamed from: a */
    public static final Bundle m6330a(C2344as asVar) {
        for (Map.Entry entry : C69505av.m100875q(asVar.f6544b).entrySet()) {
            asVar.mo5757d((String) entry.getKey(), ((C4087c) entry.getValue()).mo530a());
        }
        Set<String> keySet = asVar.f6546d.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String str : keySet) {
            arrayList.add(str);
            arrayList2.add(asVar.f6546d.get(str));
        }
        return C1891d.m5154a(new C69685i("keys", arrayList), new C69685i("values", arrayList2));
    }

    /* renamed from: b */
    public final Object mo5755b(String str) {
        return this.f6546d.get(str);
    }

    /* renamed from: c */
    public final Set mo5756c() {
        return C69514bd.m100891e(C69514bd.m100891e(this.f6546d.keySet(), this.f6544b.keySet()), this.f6547e.keySet());
    }

    /* renamed from: e */
    public final void mo5758e(String str, C4087c cVar) {
        this.f6544b.put(str, cVar);
    }

    /* renamed from: f */
    public final boolean mo5759f() {
        return this.f6546d.containsKey("FutureListenerState");
    }

    /* renamed from: g */
    public final void mo5760g(String str) {
        C69664n.m101061g(str, "key");
        this.f6546d.remove(str);
        if (((C2343ar) this.f6547e.remove(str)) == null) {
            this.f6548f.remove(str);
            return;
        }
        throw null;
    }

    public C2344as(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f6546d = linkedHashMap;
        this.f6544b = new LinkedHashMap();
        this.f6547e = new LinkedHashMap();
        this.f6548f = new LinkedHashMap();
        this.f6545c = new C2341ap(this);
        linkedHashMap.putAll(map);
    }

    /* renamed from: d */
    public final void mo5757d(String str, Object obj) {
        C69664n.m101061g(str, "key");
        if (obj != null) {
            Class[] clsArr = f6543a;
            int i = 0;
            while (i < 29) {
                Class cls = clsArr[i];
                C69664n.m101058d(cls);
                if (!cls.isInstance(obj)) {
                    i++;
                }
            }
            throw new IllegalArgumentException("Can't put value with type " + obj.getClass() + " into saved state");
        }
        Object obj2 = this.f6547e.get(str);
        C2332ag agVar = obj2 instanceof C2332ag ? (C2332ag) obj2 : null;
        if (agVar != null) {
            agVar.mo5708l(obj);
        } else {
            this.f6546d.put(str, obj);
        }
        C71548cy cyVar = (C71548cy) this.f6548f.get(str);
        if (cyVar != null) {
            cyVar.mo62807f(obj);
        }
    }
}
