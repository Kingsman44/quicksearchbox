package com.google.android.libraries.search.silk.web.homescreenshortcuts;

import com.google.android.libraries.search.silk.web.C40769f;
import com.google.android.libraries.silk.p3205a.p3224m.C41727a;
import com.google.android.libraries.web.postmessage.C43951b;
import com.google.android.libraries.web.postmessage.internal.C43968o;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4308m.C56741b;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.search.silk.web.homescreenshortcuts.e */
/* compiled from: PG */
public final /* synthetic */ class C40803e implements C43951b {

    /* renamed from: a */
    public final /* synthetic */ SilkHomescreenShortcutsMessageHandler f106957a;

    /* renamed from: b */
    public final /* synthetic */ C41727a f106958b;

    public /* synthetic */ C40803e(SilkHomescreenShortcutsMessageHandler silkHomescreenShortcutsMessageHandler, C41727a aVar) {
        this.f106957a = silkHomescreenShortcutsMessageHandler;
        this.f106958b = aVar;
    }

    /* renamed from: a */
    public final void mo42607a(JSONObject jSONObject, C43968o oVar) {
        SilkHomescreenShortcutsMessageHandler silkHomescreenShortcutsMessageHandler = this.f106957a;
        C41727a aVar = this.f106958b;
        C40769f fVar = silkHomescreenShortcutsMessageHandler.f106952d;
        Objects.requireNonNull(aVar);
        fVar.mo42720d(new C40805g(aVar), oVar, jSONObject, "HomescreenShortcuts", "installShortcut", C56741b.f151431f.getParserForType());
    }
}
