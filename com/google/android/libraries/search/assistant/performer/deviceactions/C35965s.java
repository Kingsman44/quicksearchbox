package com.google.android.libraries.search.assistant.performer.deviceactions;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.deviceactions.s */
/* compiled from: PG */
public final /* synthetic */ class C35965s implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C35981t f94142a;

    /* renamed from: b */
    public final /* synthetic */ Intent f94143b;

    public /* synthetic */ C35965s(C35981t tVar, Intent intent) {
        this.f94142a = tVar;
        this.f94143b = intent;
    }

    public final C60870cx apply(Object obj) {
        Optional optional;
        C35981t tVar = this.f94142a;
        Intent intent = this.f94143b;
        if (!((Boolean) obj).booleanValue()) {
            if (!tVar.mo39916d("com.google.android.GoogleCamera")) {
                List<ResolveInfo> queryIntentActivities = tVar.f94163b.queryIntentActivities(intent, 0);
                if (!queryIntentActivities.isEmpty()) {
                    Iterator<ResolveInfo> it = queryIntentActivities.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            optional = Optional.empty();
                            break;
                        }
                        ResolveInfo next = it.next();
                        if (next.activityInfo != null && !TextUtils.isEmpty(next.activityInfo.packageName)) {
                            optional = Optional.m71637of(next.activityInfo.packageName);
                            break;
                        }
                    }
                } else {
                    ((C59052c) ((C59052c) C35981t.f94162a.mo56226d()).mo56372aa(51803)).mo56389s("No available activity to handle intent: %s", intent);
                    optional = Optional.empty();
                }
            } else {
                optional = Optional.m71637of("com.google.android.GoogleCamera");
            }
            if (optional.isPresent()) {
                intent.setPackage((String) optional.get());
                return tVar.f94166e.mo39884a((String) optional.get());
            }
            ((C59052c) ((C59052c) C35981t.f94162a.mo56224b()).mo56372aa(51787)).mo56386p("Default camera app not found.");
        }
        return C60866ct.f164955a;
    }
}
