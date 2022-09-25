package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8504b;

import android.content.Intent;
import android.os.UserHandle;
import com.android.launcher3.compat.LauncherActivityInfoCompat;
import com.android.launcher3.compat.UserHandleCompat;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113257aj;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113263ap;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113280be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113386e;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113414ey;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.assistant.p3781ad.p3789d.C48580an;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4535g.C59203do;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C111393ab implements Function {

    /* renamed from: a */
    public final /* synthetic */ C111396ae f309939a;

    /* renamed from: b */
    public final /* synthetic */ Optional f309940b;

    public /* synthetic */ C111393ab(C111396ae aeVar, Optional optional) {
        this.f309939a = aeVar;
        this.f309940b = optional;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C111396ae aeVar = this.f309939a;
        LauncherActivityInfoCompat launcherActivityInfoCompat = (LauncherActivityInfoCompat) obj;
        UserHandleCompat userHandleCompat = (UserHandleCompat) this.f309940b.get();
        long serialNumberForUser = aeVar.f309945b.getSerialNumberForUser(userHandleCompat);
        C113414ey R = C113415ez.m187750R();
        R.mo100175t(C48672ag.WORK_APPS);
        R.mo100164i(launcherActivityInfoCompat.getLabel().toString());
        R.mo100174s(C59203do.f157270a);
        C113263ap apVar = new C113263ap();
        if (launcherActivityInfoCompat != null) {
            UserHandle user = userHandleCompat.getUser();
            if (user != null) {
                apVar.f313629a = Optional.m71637of(new C113257aj(new C113280be(launcherActivityInfoCompat, user)));
                apVar.f313630b = Optional.m71637of(new Intent("android.intent.action.MAIN").putExtra("profile", serialNumberForUser).setComponent(launcherActivityInfoCompat.getComponentName()));
                ((C113386e) R).f313957e = Optional.m71637of(apVar.mo99958a());
                R.mo100167l(20010);
                R.mo100180y(20010);
                R.mo100177v(C48580an.ICON_SHORTCUT);
                return R.mo100156a();
            }
            throw new NullPointerException("Null userHandle");
        }
        throw new NullPointerException("Null activityInfoCompat");
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
