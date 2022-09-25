package com.google.android.apps.gsa.staticplugins.opa.smartspace.p8466q;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.apps.gsa.opa.smartspace.C83724a;
import com.google.android.apps.gsa.opa.smartspace.C83730ab;
import com.google.android.apps.gsa.opa.smartspace.C83737ai;
import com.google.android.apps.gsa.opa.smartspace.C83738aj;
import com.google.android.apps.gsa.opa.smartspace.C83739ak;
import com.google.android.apps.gsa.opa.smartspace.C83740al;
import com.google.android.apps.gsa.opa.smartspace.C83741am;
import com.google.android.apps.gsa.opa.smartspace.C83798n;
import com.google.android.apps.gsa.opa.smartspace.C83800p;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.p7159c.C90953s;
import com.google.assistant.p3886c.C50818do;
import com.google.assistant.p3994s.p3995a.C53230ge;
import com.google.assistant.p3994s.p3995a.C53245gt;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.q.h */
/* compiled from: PG */
final class C110912h extends C90953s {

    /* renamed from: a */
    final /* synthetic */ C110913i f308953a;

    /* renamed from: b */
    private final C53245gt f308954b;

    /* renamed from: c */
    private final Intent f308955c;

    /* renamed from: d */
    private final SettableFuture f308956d;

    /* renamed from: e */
    private final String f308957e;

    /* renamed from: f */
    private final Integer f308958f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110912h(C110913i iVar, C53245gt gtVar, Intent intent, SettableFuture settableFuture, String str, Integer num) {
        super("SmartspaceWeatherIH");
        this.f308953a = iVar;
        this.f308957e = str;
        this.f308954b = gtVar;
        this.f308955c = intent;
        this.f308956d = settableFuture;
        this.f308958f = num;
    }

    /* renamed from: c */
    public final /* synthetic */ void mo76757c(Object obj) {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            C58976aa aaVar = C58975e.f156826a;
            String str = ((C53230ge) this.f308954b.f139569c.get(0)).f139507c;
            C53245gt gtVar = this.f308954b;
            boolean z = gtVar.f139574h;
            String str2 = ((C53230ge) gtVar.f139569c.get(0)).f139512h;
            String str3 = ((C53230ge) this.f308954b.f139569c.get(0)).f139506b;
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            C50818do doVar = (C50818do) this.f308953a.mo98929a(this.f308954b, this.f308955c, this.f308957e, this.f308958f.intValue()).get(0);
            C83730ab abVar = (C83730ab) C83739ak.f228230q.createBuilder();
            C83737ai aiVar = (C83737ai) C83738aj.f228226c.createBuilder();
            C53245gt gtVar2 = this.f308954b;
            aiVar.copyOnWrite();
            C83738aj ajVar = (C83738aj) aiVar.instance;
            gtVar2.getClass();
            ajVar.f228229b = gtVar2;
            ajVar.f228228a = 3;
            C83738aj ajVar2 = (C83738aj) aiVar.build();
            abVar.copyOnWrite();
            C83739ak akVar = (C83739ak) abVar.instance;
            ajVar2.getClass();
            akVar.f228233b = ajVar2;
            akVar.f228232a |= 1;
            if (this.f308953a.f308961b.mo79746e(C90014bt.f247312el)) {
                String str4 = this.f308957e;
                abVar.copyOnWrite();
                C83739ak akVar2 = (C83739ak) abVar.instance;
                str4.getClass();
                akVar2.f228232a |= 1024;
                akVar2.f228242k = str4;
            }
            C83798n k = C83800p.m133473k();
            C83740al alVar = (C83740al) C83741am.f228248e.createBuilder();
            alVar.copyOnWrite();
            C83741am amVar = (C83741am) alVar.instance;
            doVar.getClass();
            amVar.f228252c = doVar;
            amVar.f228250a |= 4;
            C83739ak akVar3 = (C83739ak) abVar.build();
            alVar.copyOnWrite();
            C83741am amVar2 = (C83741am) alVar.instance;
            akVar3.getClass();
            amVar2.f228251b = akVar3;
            amVar2.f228250a |= 2;
            k.mo77043b((C83741am) alVar.build());
            ((C83724a) k).f228192c = C58485gu.m89842j(C58485gu.m89846n(bitmap));
            this.f308956d.mo57356n(k.mo77042a());
            return;
        }
        this.f308956d.mo57357o(new IllegalStateException("No image for weather card"));
    }
}
