package com.google.android.libraries.logging.p2185ve.p2188c.p2190b;

import android.os.Build;
import com.google.android.libraries.logging.p2182b.C28278i;
import com.google.android.libraries.logging.p2185ve.p2187b.C28312a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import dagger.p5294a.C68220f;
import java.util.Set;

/* renamed from: com.google.android.libraries.logging.ve.c.b.u */
/* compiled from: PG */
public final class C28338u implements C68220f {
    /* renamed from: a */
    public static C28326i m53013a(C28278i iVar, C58833ax axVar, C21370a aVar, C58833ax axVar2, C58833ax axVar3) {
        C28326i iVar2 = new C28326i(iVar, (C28312a) axVar.mo56109e(C28336s.f77050a), aVar);
        if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
            Integer num = 500;
            iVar2.f77015f = num.intValue();
        }
        boolean booleanValue = ((Boolean) ((C58847bk) axVar2).f156646a).booleanValue();
        C28330m mVar = iVar2.f77012c;
        mVar.f77028b = booleanValue;
        mVar.f77029c = (Set) ((C58847bk) axVar3).f156646a;
        return iVar2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
