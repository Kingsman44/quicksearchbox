package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8007i;

import android.support.p031v4.app.C0154a;
import android.view.View;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92421a;
import com.google.android.apps.gsa.speech.hotword.unicornenrollment.p7291a.C92422b;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101781u;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.tracing.C47573bx;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.assistant.p3861at.C50375ut;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.i.ao */
/* compiled from: PG */
public final /* synthetic */ class C102093ao implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C102097as f284805a;

    /* renamed from: b */
    public final /* synthetic */ C50375ut f284806b;

    public /* synthetic */ C102093ao(C102097as asVar, C50375ut utVar) {
        this.f284805a = asVar;
        this.f284806b = utVar;
    }

    public final void onClick(View view) {
        C102097as asVar = this.f284805a;
        C50375ut utVar = this.f284806b;
        C92421a aVar = (C92421a) C92422b.f257764c.createBuilder();
        String str = utVar.f131129a;
        aVar.copyOnWrite();
        C92422b bVar = (C92422b) aVar.instance;
        str.getClass();
        bVar.f257766a |= 1;
        bVar.f257767b = str;
        asVar.f284822m.f283241a = (C92422b) aVar.build();
        C102098at atVar = (C102098at) C102099au.f284823d.createBuilder();
        C101781u uVar = asVar.f284811b;
        atVar.copyOnWrite();
        C102099au auVar = (C102099au) atVar.instance;
        uVar.getClass();
        auVar.f284826b = uVar;
        auVar.f284825a |= 1;
        atVar.copyOnWrite();
        C102099au auVar2 = (C102099au) atVar.instance;
        utVar.getClass();
        auVar2.f284827c = utVar;
        auVar2.f284825a |= 2;
        C102081ac acVar = new C102081ac();
        C68324h.m98669f(acVar);
        C47243l.m84039a(acVar, (C102099au) atVar.build());
        C47573bx w = C47831fm.m85028w();
        try {
            C0154a aVar2 = new C0154a(asVar.f284812c.getChildFragmentManager());
            aVar2.mo691x(17498112, 17498113, 0, 0);
            aVar2.mo689v(R.id.hotword_enrollment_unicorn_container, acVar, (String) null);
            aVar2.mo505b(true);
            w.close();
            return;
        } catch (Throwable th) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class}).invoke(th, new Object[]{th});
            } catch (Exception unused) {
            }
        }
        throw th;
    }
}
