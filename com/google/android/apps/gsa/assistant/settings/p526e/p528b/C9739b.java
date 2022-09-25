package com.google.android.apps.gsa.assistant.settings.p526e.p528b;

import android.app.Activity;
import android.util.Base64;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.base.C9510l;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3957l.p3967d.p3968a.p3972d.p3973a.C52985a;
import com.google.assistant.p3957l.p3967d.p3968a.p3972d.p3973a.C52986b;
import com.google.assistant.p3957l.p3967d.p3968a.p3972d.p3973a.C52987c;
import com.google.assistant.p3957l.p3967d.p3968a.p3972d.p3973a.C52988d;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.b.b */
/* compiled from: PG */
public final class C9739b implements C73740a {

    /* renamed from: a */
    private final Activity f33631a;

    /* renamed from: b */
    private final C9510l f33632b;

    /* renamed from: c */
    private final C22871g f33633c;

    public C9739b(Activity activity, C9510l lVar, C22871g gVar) {
        this.f33631a = activity;
        this.f33632b = lVar;
        this.f33633c = gVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "assistantSettingsAppBarInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public String getMenuProto() {
        Menu v = this.f33632b.mo17821v();
        C52985a aVar = (C52985a) C52988d.f138902b.createBuilder();
        for (int i = 0; i < v.size(); i++) {
            MenuItem item = v.getItem(i);
            C52986b bVar = (C52986b) C52987c.f138897d.createBuilder();
            int itemId = item.getItemId();
            bVar.copyOnWrite();
            C52987c cVar = (C52987c) bVar.instance;
            cVar.f138899a |= 1;
            cVar.f138900b = itemId;
            String obj = item.getTitle().toString();
            bVar.copyOnWrite();
            C52987c cVar2 = (C52987c) bVar.instance;
            obj.getClass();
            cVar2.f138899a = 2 | cVar2.f138899a;
            cVar2.f138901c = obj;
            aVar.copyOnWrite();
            C52988d dVar = (C52988d) aVar.instance;
            C52987c cVar3 = (C52987c) bVar.build();
            cVar3.getClass();
            C62971cq cqVar = dVar.f138904a;
            if (!cqVar.mo58948c()) {
                dVar.f138904a = C62942bv.mutableCopy(cqVar);
            }
            dVar.f138904a.add(cVar3);
        }
        return Base64.encodeToString(((C52988d) aVar.build()).toByteArray(), 2);
    }

    @JavascriptInterface
    public void goBack() {
        C22871g gVar = this.f33633c;
        Activity activity = this.f33631a;
        Objects.requireNonNull(activity);
        gVar.mo28212l("AppBarJavascriptInterface#goBack", new C9738a(activity));
    }

    @JavascriptInterface
    public void onMenuItemAction(int i) {
        this.f33632b.mo17820F(i);
    }
}
