package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7989l.p7990a;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.p031v4.app.FragmentManager;
import android.support.p033v7.app.C0392m;
import android.view.ContextThemeWrapper;
import com.android.p265e.C5114a;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.android.apps.gsa.speech.p7311n.C92533a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101497ae;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.p3505b.C44534d;
import com.google.android.material.p3506c.C44581b;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.l.a.i */
/* compiled from: PG */
public final class C101883i {

    /* renamed from: a */
    public final C92533a f284173a;

    /* renamed from: b */
    private final Resources f284174b;

    /* renamed from: c */
    private final C90021c f284175c;

    /* renamed from: d */
    private final C92486a f284176d;

    /* renamed from: e */
    private final boolean f284177e;

    /* renamed from: f */
    private final boolean f284178f;

    /* renamed from: g */
    private final C74555u f284179g;

    /* renamed from: h */
    private final C101497ae f284180h;

    public C101883i(Resources resources, C90021c cVar, C92486a aVar, boolean z, boolean z2, C74555u uVar, C101497ae aeVar, C92533a aVar2) {
        this.f284174b = resources;
        this.f284175c = cVar;
        this.f284176d = aVar;
        this.f284177e = z;
        this.f284178f = z2;
        this.f284179g = uVar;
        this.f284180h = aeVar;
        this.f284173a = aVar2;
    }

    /* renamed from: b */
    private final AlertDialog m168558b(Activity activity, Runnable runnable, String str) {
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        Resources resources = this.f284174b;
        Object[] objArr = {this.f284176d.mo87230d()};
        AlertDialog create = builder.setTitle(C5114a.m13988b(Locale.getDefault(), resources.getString(R.string.hotword_enrollment_phone_skip_dialog_title, objArr), new Object[0])).setMessage(str).setPositiveButton(R.string.hotword_enrollment_phone_skip_dialog_positive_button, new C101876b(this, runnable)).setNegativeButton(R.string.hotword_enrollment_phone_skip_dialog_negative_button, (DialogInterface.OnClickListener) null).create();
        if (this.f284179g.mo70886d().mo70847a().equals(ac.b)) {
            create.setOnShowListener(new C101877c(create, activity));
        }
        return create;
    }

    /* renamed from: c */
    private final Dialog m168559c(Activity activity, Runnable runnable, String str) {
        Context contextThemeWrapper = new ContextThemeWrapper(activity, true != this.f284177e ? 2132150720 : 2132150704);
        if (this.f284178f) {
            contextThemeWrapper = C44534d.m78716c(contextThemeWrapper);
        }
        C44581b bVar = new C44581b(contextThemeWrapper, 2132150987);
        bVar.f1347a.f1322c = R.drawable.gs_warning_vd_theme_20;
        bVar.mo47605x(C5114a.m13988b(Locale.getDefault(), this.f284174b.getString(R.string.hotword_enrollment_phone_skip_dialog_title, new Object[]{this.f284176d.mo87230d()}), new Object[0]));
        bVar.f1347a.f1326g = str;
        bVar.mo47601t(R.string.hotword_enrollment_phone_skip_dialog_positive_button, new C101878d(this, runnable));
        bVar.mo47598q(R.string.hotword_enrollment_phone_skip_dialog_negative_button, (DialogInterface.OnClickListener) null);
        C0392m create = bVar.create();
        create.setOnShowListener(new C101879e(create));
        return create;
    }

    /* renamed from: a */
    public final void mo92664a(Activity activity, Runnable runnable, FragmentManager fragmentManager) {
        String str;
        String str2;
        String str3;
        if (this.f284179g.mo70891j()) {
            if (!this.f284175c.mo79746e(C90082eg.f249887aC) || !this.f284180h.mo92334g()) {
                if (this.f284180h.mo92334g()) {
                    str3 = C5114a.m13988b(Locale.getDefault(), this.f284174b.getString(R.string.unicorn_hotword_enrollment_google_home_oobe_skip_dialog_message), "GENDER", this.f284180h.mo92330c(), "PERSON", this.f284180h.mo92329b());
                } else {
                    str3 = this.f284174b.getString(R.string.hotword_enrollment_google_home_oobe_skip_dialog_message);
                }
                new AlertDialog.Builder(activity).setMessage(str3).setTitle(R.string.hotword_enrollment_google_home_oobe_skip_dialog_title).setNegativeButton(R.string.hotword_enrollment_google_home_oobe_skip_dialog_negative_button, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.hotword_enrollment_google_home_oobe_skip_dialog_positive_button, new C101875a(runnable)).show().getButton(-2).setTextColor(this.f284174b.getColor(R.color.howord_enrollment_oobe_decline_botton_text_color));
                return;
            }
            String b = this.f284180h.mo92329b();
            String c = this.f284180h.mo92330c();
            Bundle bundle = new Bundle();
            bundle.putString("unicorn_name", b);
            bundle.putString("unicorn_gender", c);
            C101882h hVar = new C101882h();
            hVar.setArguments(bundle);
            hVar.f284172a = runnable;
            if (fragmentManager.f634a.mo671c("UnicornErrorDialog") == null) {
                hVar.showNow(fragmentManager, "UnicornErrorDialog");
            }
        } else if (this.f284179g.mo70892k() && this.f284179g.mo70887e().mo70856e() && this.f284179g.mo70887e().mo70853a().mo70880d() && !this.f284179g.mo70887e().mo70853a().mo70881e()) {
            if (this.f284180h.f283244a.f284137d.get()) {
                str2 = C5114a.m13988b(Locale.getDefault(), this.f284174b.getString(R.string.unicorn_hotword_enrollment_rohan_skip_dialog_message, new Object[]{this.f284180h.mo92329b(), this.f284176d.mo87230d(), this.f284176d.mo87230d(), this.f284180h.mo92329b()}), "GENDER", this.f284180h.mo92330c());
            } else {
                Resources resources = this.f284174b;
                Object[] objArr = {this.f284176d.mo87230d(), this.f284176d.mo87230d()};
                str2 = C5114a.m13988b(Locale.getDefault(), resources.getString(R.string.hotword_enrollment_rohan_skip_dialog_message, objArr), new Object[0]);
            }
            if (this.f284179g.mo70886d().mo70847a().d() == 2) {
                Dialog c2 = m168559c(activity, runnable, str2);
                c2.setCanceledOnTouchOutside(true);
                c2.show();
                return;
            }
            m168558b(activity, runnable, str2).show();
        } else if (!this.f284175c.mo79746e(C90082eg.f249882Y) || !this.f284179g.mo70892k() || this.f284179g.mo70887e().mo70857f() || this.f284179g.mo70887e().mo70858g() || this.f284179g.mo70887e().mo70853a().mo70880d() || this.f284179g.mo70887e().mo70853a().mo70881e()) {
            runnable.run();
        } else {
            if (this.f284180h.f283244a.f284137d.get()) {
                str = C5114a.m13988b(Locale.getDefault(), this.f284174b.getString(R.string.unicorn_hotword_enrollment_phone_skip_dialog_message, new Object[]{this.f284180h.mo92329b(), this.f284176d.mo87230d(), this.f284176d.mo87230d(), this.f284180h.mo92329b()}), "GENDER", this.f284180h.mo92330c());
            } else {
                Resources resources2 = this.f284174b;
                Object[] objArr2 = {this.f284176d.mo87230d(), this.f284176d.mo87230d()};
                str = C5114a.m13988b(Locale.getDefault(), resources2.getString(R.string.hotword_enrollment_phone_skip_dialog_message, objArr2), new Object[0]);
            }
            if (this.f284179g.mo70886d().mo70847a().d() == 2) {
                Dialog c3 = m168559c(activity, runnable, str);
                c3.setCanceledOnTouchOutside(true);
                c3.show();
                return;
            }
            m168558b(activity, runnable, str).show();
        }
    }
}
