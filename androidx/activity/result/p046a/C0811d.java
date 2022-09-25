package androidx.activity.result.p046a;

import android.content.Context;
import android.content.Intent;
import androidx.core.content.C1882h;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p5462h.C69685i;
import p5462h.p5463a.C69497an;
import p5462h.p5463a.C69505av;
import p5462h.p5463a.C69531o;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: androidx.activity.result.a.d */
/* compiled from: PG */
public final class C0811d extends C0809b {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Intent mo613a(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C69664n.m101061g(strArr, "input");
        return C0810c.m2660a(strArr);
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo614b(int i, Intent intent) {
        if (i != -1 || intent == null) {
            return C69497an.f185919a;
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C69497an.f185919a;
        }
        int length = intArrayExtra.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(Boolean.valueOf(intArrayExtra[i2] == 0));
        }
        return C69505av.m100874p(C69540x.m100843Y(C69531o.m100936m(stringArrayExtra), arrayList));
    }

    /* renamed from: c */
    public final /* synthetic */ C0808a mo3368c(Context context, Object obj) {
        String[] strArr = (String[]) obj;
        C69664n.m101061g(strArr, "input");
        if (r0 == 0) {
            return new C0808a(C69497an.f185919a);
        }
        for (String c : strArr) {
            if (C1882h.m5137c(context, c) != 0) {
                return null;
            }
        }
        int b = C69505av.m100860b(r6);
        if (b < 16) {
            b = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b);
        for (String iVar : strArr) {
            C69685i iVar2 = new C69685i(iVar, true);
            linkedHashMap.put(iVar2.f186052a, iVar2.f186053b);
        }
        return new C0808a(linkedHashMap);
    }
}
