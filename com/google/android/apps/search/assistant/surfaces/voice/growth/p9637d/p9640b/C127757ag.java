package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127747h;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127748i;
import com.google.common.p4522b.C58495hd;
import com.google.protobuf.C62963cj;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.ag */
/* compiled from: PG */
public final /* synthetic */ class C127757ag implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Context f351673a;

    /* renamed from: b */
    public final /* synthetic */ C127747h f351674b;

    public /* synthetic */ C127757ag(Context context, C127747h hVar) {
        this.f351673a = context;
        this.f351674b = hVar;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        Context context = this.f351673a;
        C127747h hVar = this.f351674b;
        C127743d dVar = (C127743d) obj;
        C58495hd hdVar = C127760aj.f351677a;
        C127748i iVar = dVar.f351641f;
        if (iVar == null) {
            return false;
        }
        String str = iVar.f351658a;
        if (!TextUtils.isEmpty(str)) {
            try {
                context.getPackageManager().getApplicationInfo(str, 0);
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }
        if (hVar.equals(C127747h.ANY)) {
            return true;
        }
        C127748i iVar2 = dVar.f351641f;
        if (iVar2 == null) {
            iVar2 = C127748i.f351656e;
        }
        return new C62963cj(iVar2.f351660c, C127748i.f351655d).contains(hVar);
    }
}
