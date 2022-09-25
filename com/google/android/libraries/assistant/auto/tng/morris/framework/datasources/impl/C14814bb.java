package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14309el;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bb */
/* compiled from: PG */
public final /* synthetic */ class C14814bb implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C14820bh f44615a;

    /* renamed from: b */
    public final /* synthetic */ String f44616b;

    /* renamed from: c */
    public final /* synthetic */ Optional f44617c;

    /* renamed from: d */
    public final /* synthetic */ ComponentName f44618d;

    public /* synthetic */ C14814bb(C14820bh bhVar, String str, Optional optional, ComponentName componentName) {
        this.f44615a = bhVar;
        this.f44616b = str;
        this.f44617c = optional;
        this.f44618d = componentName;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C14820bh bhVar = this.f44615a;
        String str = this.f44616b;
        Optional optional = this.f44617c;
        ComponentName componentName = this.f44618d;
        if (optional.isEmpty()) {
            cVar.mo5437b(C14309el.CONNECTED_MEDIA_BROWSE_NOT_AVAILABLE);
            return C14309el.CONNECTED_MEDIA_BROWSE_NOT_AVAILABLE.name();
        }
        bhVar.f44629b = (MediaBrowserCompat) optional.get();
        bhVar.f44630c = componentName;
        if (!bhVar.f44629b.mo805i()) {
            cVar.mo5437b(C14309el.MEDIA_BROWSE_NOT_CONNECTED);
            return C14309el.MEDIA_BROWSE_NOT_CONNECTED.name();
        } else if (!str.equals("PENDING_MEDIA_APP_ROOT") || (str = bhVar.f44629b.mo799c()) != null) {
            C59104x b = C14820bh.f44628a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.MedBTDataSrc");
            ((C59052c) ((C59052c) b).mo56372aa(45563)).mo56389s("Subscribing to node: %s", str);
            String str2 = bhVar.f44631d;
            if (str2 != null) {
                MediaBrowserCompat mediaBrowserCompat = bhVar.f44629b;
                mediaBrowserCompat.getClass();
                mediaBrowserCompat.mo804h(str2);
            }
            bhVar.f44631d = str;
            MediaBrowserCompat mediaBrowserCompat2 = bhVar.f44629b;
            mediaBrowserCompat2.getClass();
            mediaBrowserCompat2.mo803g(str, new C14819bg(bhVar, str, componentName, cVar));
            return "MEDIA_BROWSER_SUBCRIPTION_INITIATED";
        } else {
            cVar.mo5437b(C14309el.MEDIA_BROWSE_HAS_NULL_ROOT);
            return C14309el.MEDIA_BROWSE_HAS_NULL_ROOT.name();
        }
    }
}
