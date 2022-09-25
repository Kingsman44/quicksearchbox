package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p835b;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p852k.C12788a;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12989g;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.b.u */
/* compiled from: PG */
public final /* synthetic */ class C12748u implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C12751x f39879a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f39880b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f39881c;

    /* renamed from: d */
    public final /* synthetic */ String f39882d;

    /* renamed from: e */
    public final /* synthetic */ Intent f39883e;

    public /* synthetic */ C12748u(C12751x xVar, C60870cx cxVar, C60870cx cxVar2, String str, Intent intent) {
        this.f39879a = xVar;
        this.f39880b = cxVar;
        this.f39881c = cxVar2;
        this.f39882d = str;
        this.f39883e = intent;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        Optional optional;
        C12751x xVar = this.f39879a;
        C60870cx cxVar = this.f39880b;
        C60870cx cxVar2 = this.f39881c;
        String str = this.f39882d;
        Intent intent = this.f39883e;
        Boolean bool = (Boolean) C60856cj.m92909r(cxVar2);
        if (!((Boolean) C60856cj.m92909r(cxVar)).booleanValue() || xVar.f39889d != C12989g.AUTO_EMBEDDED) {
            if (((Boolean) xVar.f39891f.mo17428b()).booleanValue()) {
                if (intent != null) {
                    return xVar.mo20772b(intent, str);
                }
                if (!bool.booleanValue()) {
                    return C60856cj.m92900i(C12788a.f39970e);
                }
            } else if (!bool.booleanValue()) {
                return C60856cj.m92900i(C12788a.f39970e);
            } else {
                if (intent != null) {
                    return xVar.mo20772b(intent, str);
                }
            }
            if (!str.isEmpty()) {
                return xVar.mo20772b(((PackageManager) xVar.f39887b.mo27525b()).getLaunchIntentForPackage(str), str);
            }
            ((C59052c) ((C59052c) C12751x.f39886a.mo56226d()).mo56372aa(44427)).mo56386p("Unable to open provider.");
            return C60856cj.m92900i(C12788a.f39966a);
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.car.intent.action.MEDIA_TEMPLATE");
        Intent intent3 = new Intent();
        intent3.setPackage(str);
        intent3.setAction("android.media.browse.MediaBrowserService");
        List<ResolveInfo> queryIntentServices = ((PackageManager) xVar.f39887b.mo27525b()).queryIntentServices(intent3, 64);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            optional = Optional.empty();
        } else {
            String str2 = queryIntentServices.get(0).serviceInfo.name;
            if (!TextUtils.isEmpty(str2)) {
                optional = Optional.m71637of(new ComponentName(str, str2));
            } else {
                optional = Optional.empty();
            }
        }
        if (optional.isPresent()) {
            intent2.putExtra("android.car.intent.extra.MEDIA_COMPONENT", ((ComponentName) optional.get()).flattenToString());
        } else {
            ((C59052c) ((C59052c) C12751x.f39886a.mo56226d()).mo56372aa(44428)).mo56389s("Unable to find component name for package %s.", str);
            intent2.putExtra("android.car.intent.extra.MEDIA_PACKAGE", str);
        }
        return xVar.mo20772b(intent2, (String) null);
    }
}
