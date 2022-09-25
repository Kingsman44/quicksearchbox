package androidx.navigation;

import java.util.LinkedHashMap;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.navigation.ck */
/* compiled from: PG */
public class C3870ck {

    /* renamed from: a */
    public static final Map f12430a = new LinkedHashMap();

    /* renamed from: b */
    public final Map f12431b = new LinkedHashMap();

    /* renamed from: a */
    public C3868ci mo8077a(String str) {
        C69664n.m101061g(str, "name");
        if (C3869cj.m11161a(str)) {
            C3868ci ciVar = (C3868ci) this.f12431b.get(str);
            if (ciVar != null) {
                return ciVar;
            }
            throw new IllegalStateException("Could not find Navigator with name \"" + str + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    /* renamed from: b */
    public final void mo8124b(C3868ci ciVar) {
        String b = C3869cj.m11162b(ciVar.getClass());
        C69664n.m101061g(b, "name");
        if (C3869cj.m11161a(b)) {
            C3868ci ciVar2 = (C3868ci) this.f12431b.get(b);
            if (!C69664n.m101066l(ciVar2, ciVar)) {
                if (ciVar2 != null && ciVar2.f12428a) {
                    throw new IllegalStateException("Navigator " + ciVar + " is replacing an already attached " + ciVar2);
                } else if (!ciVar.f12428a) {
                    C3868ci ciVar3 = (C3868ci) this.f12431b.put(b, ciVar);
                } else {
                    throw new IllegalStateException("Navigator " + ciVar + " is already attached to another NavController");
                }
            }
        } else {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
    }
}
