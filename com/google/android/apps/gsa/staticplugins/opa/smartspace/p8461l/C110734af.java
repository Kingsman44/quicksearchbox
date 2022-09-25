package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8461l;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.smartspace.C92113i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3886c.C50818do;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.l.af */
/* compiled from: PG */
public final /* synthetic */ class C110734af implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C110764bi f308534a;

    /* renamed from: b */
    public final /* synthetic */ List f308535b;

    /* renamed from: c */
    public final /* synthetic */ C58833ax f308536c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f308537d;

    /* renamed from: e */
    public final /* synthetic */ C83800p f308538e;

    public /* synthetic */ C110734af(C110764bi biVar, List list, C58833ax axVar, C60870cx cxVar, C83800p pVar) {
        this.f308534a = biVar;
        this.f308535b = list;
        this.f308536c = axVar;
        this.f308537d = cxVar;
        this.f308538e = pVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C110764bi biVar = this.f308534a;
        List list = this.f308535b;
        C58833ax axVar = this.f308536c;
        C60870cx cxVar = this.f308537d;
        C83800p pVar = this.f308538e;
        Bitmap bitmap = ((BitmapDrawable) ((Drawable) obj)).getBitmap();
        C50818do doVar = ((C83741am) axVar.mo56107c()).f228252c;
        if (doVar == null) {
            doVar = C50818do.f132293H;
        }
        list.add(new C92113i(doVar, bitmap, true));
        C92113i[] iVarArr = new C92113i[list.size()];
        list.toArray(iVarArr);
        biVar.mo98881s(iVarArr);
        return biVar.mo98876n(iVarArr, cxVar, pVar);
    }
}
