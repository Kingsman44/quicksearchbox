package com.google.android.libraries.p3332u.p3333a.p3335b;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.gmscompliance.p10808ui.UncertifiedDeviceActivity;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.u.a.b.b */
/* compiled from: PG */
final class C43189b extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ Activity f112904a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C43189b(Activity activity) {
        super(0);
        this.f112904a = activity;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5672a() {
        Activity activity = this.f112904a;
        if (!(activity instanceof UncertifiedDeviceActivity)) {
            C69664n.m101061g(activity, "caughtActivity");
            C59052c cVar = (C59052c) C43196i.f112918a.mo56224b();
            cVar.mo56379ah(new C59094n(48170));
            cVar.mo56386p("Redirecting to UncertifiedDeviceActivity.");
            C59052c cVar2 = (C59052c) C43196i.f112918a.mo56224b();
            cVar2.mo56379ah(new C59094n(48171));
            cVar2.mo56386p("Mobile-website redirection button will be hidden on UncertifiedDeviceActivity.");
            Intent intent = new Intent(activity, UncertifiedDeviceActivity.class);
            TextUtils.isEmpty((CharSequence) null);
            if (!TextUtils.isEmpty((CharSequence) null)) {
                intent = intent.putExtra("customBodyText", (String) null);
            }
            intent.putExtra("overrideNavBarColor", true);
            C69664n.m101060f(intent, "intent");
            C43196i.m76178a(intent);
            activity.startActivity(intent);
            C59052c cVar3 = (C59052c) C43196i.f112918a.mo56224b();
            String simpleName = activity.getClass().getSimpleName();
            cVar3.mo56379ah(new C59094n(48172));
            cVar3.mo56389s("Killing %s!", simpleName);
            activity.finish();
        }
        return C69788q.f186170a;
    }
}
