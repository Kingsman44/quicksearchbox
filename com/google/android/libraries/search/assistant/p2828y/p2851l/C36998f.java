package com.google.android.libraries.search.assistant.p2828y.p2851l;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3897e.p3917i.p3918a.C51310cz;
import com.google.assistant.p3897e.p3917i.p3918a.C51376fk;
import com.google.assistant.p3897e.p3917i.p3918a.C51378fm;
import com.google.assistant.p3897e.p3917i.p3918a.C51379fn;
import com.google.common.base.C58832aw;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.assistant.y.l.f */
/* compiled from: PG */
public final /* synthetic */ class C36998f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C36999g f96358a;

    /* renamed from: b */
    public final /* synthetic */ C51376fk f96359b;

    /* renamed from: c */
    public final /* synthetic */ C36996d f96360c;

    public /* synthetic */ C36998f(C36999g gVar, C51376fk fkVar, C36996d dVar) {
        this.f96358a = gVar;
        this.f96359b = fkVar;
        this.f96360c = dVar;
    }

    public final Object call() {
        C51310cz czVar;
        C36999g gVar = this.f96358a;
        C51376fk fkVar = this.f96359b;
        C36996d dVar = this.f96360c;
        if (gVar.f96363b.f96587b.isDeviceLocked()) {
            czVar = C51310cz.DEVICE_LOCKED;
        } else {
            czVar = C51310cz.DEVICE_UNLOCKED;
        }
        if (czVar == C51310cz.DEVICE_LOCKED) {
            C51378fm fmVar = C51378fm.LOCKSCREEN;
            fkVar.copyOnWrite();
            C51379fn fnVar = (C51379fn) fkVar.instance;
            C51379fn fnVar2 = C51379fn.f133814i;
            fnVar.f133821f = fmVar.f133813e;
            fnVar.f133816a |= 256;
        } else {
            if (!dVar.mo40524a().isEmpty()) {
                ComponentName componentName = (ComponentName) dVar.mo40524a().get();
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                ResolveInfo resolveActivity = gVar.f96362a.getPackageManager().resolveActivity(intent, 65536);
                String str = (resolveActivity == null || resolveActivity.activityInfo == null) ? BuildConfig.FLAVOR : resolveActivity.activityInfo.packageName;
                boolean z = false;
                if (!TextUtils.isEmpty(str) && C58832aw.m90831a(componentName.getPackageName(), str)) {
                    z = true;
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    C51378fm fmVar2 = C51378fm.IN_APP;
                    fkVar.copyOnWrite();
                    C51379fn fnVar3 = (C51379fn) fkVar.instance;
                    C51379fn fnVar4 = C51379fn.f133814i;
                    fnVar3.f133821f = fmVar2.f133813e;
                    fnVar3.f133816a |= 256;
                }
            }
            C51378fm fmVar3 = C51378fm.HOMESCREEN;
            fkVar.copyOnWrite();
            C51379fn fnVar5 = (C51379fn) fkVar.instance;
            C51379fn fnVar6 = C51379fn.f133814i;
            fnVar5.f133821f = fmVar3.f133813e;
            fnVar5.f133816a |= 256;
        }
        return (C51379fn) fkVar.build();
    }
}
