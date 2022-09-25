package com.google.android.libraries.elements.p1714d;

import android.text.TextUtils;
import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21260bc;
import com.google.android.libraries.elements.interfaces.C21292ch;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentElement;
import com.google.android.libraries.elements.interfaces.ComponentState;
import com.google.android.libraries.elements.interfaces.DevResourceManager;
import com.google.android.libraries.elements.interfaces.EntitiesProcessorResolver;
import com.google.android.libraries.elements.p1727f.C21166o;
import com.google.protos.youtube.elements.C66260r;
import java.nio.ByteBuffer;
import p5488io.grpc.Status;
import p5488io.p5490b.C70121m;
import p5488io.p5490b.p5497e.p5502e.p5506d.C69977g;

/* renamed from: com.google.android.libraries.elements.d.u */
/* compiled from: PG */
public final /* synthetic */ class C21131u implements C70121m {

    /* renamed from: a */
    public final /* synthetic */ C20794ag f59260a;

    /* renamed from: b */
    public final /* synthetic */ C6411u f59261b;

    /* renamed from: c */
    public final /* synthetic */ C21319z f59262c;

    /* renamed from: d */
    public final /* synthetic */ ComponentElement f59263d;

    /* renamed from: e */
    public final /* synthetic */ DevResourceManager f59264e;

    /* renamed from: f */
    public final /* synthetic */ EntitiesProcessorResolver f59265f;

    /* renamed from: g */
    public final /* synthetic */ String f59266g;

    /* renamed from: h */
    public final /* synthetic */ C21292ch f59267h;

    /* renamed from: i */
    public final /* synthetic */ ByteBuffer f59268i;

    public /* synthetic */ C21131u(C20794ag agVar, C6411u uVar, C21319z zVar, ComponentElement componentElement, DevResourceManager devResourceManager, EntitiesProcessorResolver entitiesProcessorResolver, String str, C21292ch chVar, ByteBuffer byteBuffer) {
        this.f59260a = agVar;
        this.f59261b = uVar;
        this.f59262c = zVar;
        this.f59263d = componentElement;
        this.f59264e = devResourceManager;
        this.f59265f = entitiesProcessorResolver;
        this.f59266g = str;
        this.f59267h = chVar;
        this.f59268i = byteBuffer;
    }

    /* renamed from: a */
    public final void mo26136a(C69977g gVar) {
        ComponentState componentState;
        C20794ag agVar = this.f59260a;
        C6411u uVar = this.f59261b;
        C21319z zVar = this.f59262c;
        ComponentElement componentElement = this.f59263d;
        DevResourceManager devResourceManager = this.f59264e;
        EntitiesProcessorResolver entitiesProcessorResolver = this.f59265f;
        String str = this.f59266g;
        C21292ch chVar = this.f59267h;
        ByteBuffer byteBuffer = this.f59268i;
        agVar.f58183e.mo27525b();
        C20907dc dcVar = (C20907dc) uVar.mo13469d(C20907dc.class);
        C21166o oVar = null;
        if (dcVar != null) {
            componentState = dcVar.mo26049a(zVar.mo26815p());
            if (componentState == null) {
                componentState = ComponentState.create();
            }
        } else {
            componentState = null;
        }
        try {
            Component component = (Component) Component.createWithElement(componentElement, devResourceManager, entitiesProcessorResolver, agVar.f58188j, componentState).mo60269a(C21135y.f59284a);
            if (!(dcVar == null || componentState == null || componentState.isEmpty())) {
                dcVar.mo26050b(zVar.mo26815p(), componentState);
            }
            if (agVar.f58191m.mo26164a()) {
                oVar = new C21166o(str, component);
            }
            C21166o oVar2 = oVar;
            String templateUri = component.getTemplateUri();
            chVar.mo26279g(templateUri);
            if (!TextUtils.isEmpty(templateUri)) {
                zVar.mo26846G(templateUri, "|");
            }
            C20793af afVar = new C20793af(agVar, zVar, chVar, byteBuffer, component, gVar, oVar2);
            component.setObserver(afVar);
            Status componentDidUpdate = afVar.componentDidUpdate(component);
            if (!componentDidUpdate.mo61679g()) {
                agVar.f58180b.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "componentDidUpdate error (" + componentDidUpdate.getCode().toString() + "): " + componentDidUpdate.getDescription(), zVar, componentDidUpdate.f186920q);
            }
            gVar.mo61553c(new C21136z(agVar, oVar2, component, zVar));
        } catch (C21260bc e) {
            gVar.mo61551a(e);
        }
    }
}
