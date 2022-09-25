package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.p033v7.widget.C0673gh;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import com.android.launcher3.compat.LauncherAppsCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.android.launcher3.compat.UserManagerCompat;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113284bi;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113342cm;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113367dh;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113427g;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.p8579c.C113324u;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.Arrays;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.dd */
/* compiled from: PG */
public final class C112805dd implements C113342cm {

    /* renamed from: b */
    private static final C59071e f312651b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.dd");

    /* renamed from: a */
    public final C113367dh f312652a;

    /* renamed from: c */
    private final C91097g f312653c;

    /* renamed from: d */
    private final C113324u f312654d;

    /* renamed from: e */
    private final C112794ct f312655e;

    /* renamed from: f */
    private final int f312656f;

    /* renamed from: g */
    private final UserManagerCompat f312657g;

    /* renamed from: h */
    private final LauncherAppsCompat f312658h;

    /* renamed from: i */
    private final Toast f312659i;

    /* renamed from: j */
    private final C68214a f312660j;

    public C112805dd(Context context, C113367dh dhVar, C91097g gVar, C113324u uVar, C112794ct ctVar, C68214a aVar) {
        this.f312653c = gVar;
        this.f312652a = dhVar;
        this.f312656f = context.getResources().getDimensionPixelSize(R.dimen.app_icon_elevation);
        this.f312654d = uVar;
        this.f312655e = ctVar;
        this.f312657g = UserManagerCompat.getInstance(context);
        this.f312658h = LauncherAppsCompat.getInstance(context);
        this.f312659i = Toast.makeText(context, context.getText(R.string.app_not_installed), 0);
        this.f312660j = aVar;
    }

    /* renamed from: a */
    public final int mo99713a() {
        return R.layout.icon_shortcut_suggestion_item;
    }

    /* renamed from: b */
    public final int mo99684b(C113415ez ezVar) {
        return 85778;
    }

    /* renamed from: c */
    public final C0673gh mo99714c(View view) {
        return new C112804dc(view);
    }

    /* renamed from: d */
    public final /* synthetic */ Optional mo99715d(C113415ez ezVar) {
        return Optional.empty();
    }

    /* renamed from: e */
    public final /* synthetic */ Optional mo99716e(C0673gh ghVar) {
        return Optional.empty();
    }

    /* renamed from: f */
    public final void mo99685f(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        Optional x = ezVar.mo100224x();
        if (!x.isEmpty()) {
            this.f312655e.mo99739a(6, ezVar, esVar, Optional.m71637of(Arrays.asList(new Integer[]{23176})));
            int[] iArr = new int[2];
            ImageView imageView = ((C112804dc) ghVar).f312649a;
            imageView.getLocationOnScreen(iArr);
            int i = iArr[0];
            Rect rect = new Rect(i, iArr[1], imageView.getWidth() + i, iArr[1] + imageView.getHeight());
            if (((C113284bi) x.get()).mo99960b().isPresent()) {
                Intent intent = (Intent) ((C113284bi) x.get()).mo99960b().get();
                if (intent.hasExtra("profile")) {
                    UserHandleCompat userForSerialNumber = this.f312657g.getUserForSerialNumber(intent.getLongExtra("profile", 0));
                    if (this.f312658h.resolveActivity(intent, userForSerialNumber) == null) {
                        this.f312659i.show();
                        return;
                    }
                    LauncherAppsCompat launcherAppsCompat = this.f312658h;
                    ComponentName component = intent.getComponent();
                    component.getClass();
                    launcherAppsCompat.startActivityForProfile(component, userForSerialNumber, rect, new Bundle());
                } else if (this.f312654d.mo100117c(intent) == null) {
                    this.f312659i.show();
                } else {
                    this.f312653c.mo65089a(intent);
                }
            }
        }
    }

    /* renamed from: g */
    public final void mo99717g(C113415ez ezVar, View view) {
        ((C112880fy) this.f312660j.mo27525b()).mo99774b(ezVar, view);
    }

    /* renamed from: h */
    public final void mo99686h(C113408es esVar, C113415ez ezVar, C0673gh ghVar, C113427g gVar) {
        C59104x b = f312651b.mo56224b();
        b.mo56378ag(C58975e.f156826a, "IconShortcutSIR");
        ((C59052c) ((C59052c) b).mo56372aa(27801)).mo56386p("#renderView()");
        C112804dc dcVar = (C112804dc) ghVar;
        Optional x = ezVar.mo100224x();
        if (x.isEmpty()) {
            dcVar.itemView.setVisibility(8);
            return;
        }
        dcVar.f312649a.setVisibility(8);
        ((C113284bi) x.get()).mo99961c().ifPresent(new C112802da(this, dcVar));
        ImageView imageView = dcVar.f312649a;
        imageView.setOutlineProvider(new C112803db());
        imageView.setElevation((float) this.f312656f);
        dcVar.f312650b.setText(ezVar.mo100199L());
    }

    /* renamed from: i */
    public final /* synthetic */ boolean mo99718i() {
        return false;
    }
}
