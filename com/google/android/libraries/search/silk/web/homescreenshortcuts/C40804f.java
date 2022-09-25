package com.google.android.libraries.search.silk.web.homescreenshortcuts;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.silk.p3205a.p3224m.C41727a;
import com.google.android.libraries.silk.p3238b.p3239a.C41743a;
import com.google.android.libraries.web.postmessage.internal.PostMessageMixinImpl;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.search.silk.web.homescreenshortcuts.f */
/* compiled from: PG */
public final /* synthetic */ class C40804f implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ SilkHomescreenShortcutsMessageHandler f106959a;

    public /* synthetic */ C40804f(SilkHomescreenShortcutsMessageHandler silkHomescreenShortcutsMessageHandler) {
        this.f106959a = silkHomescreenShortcutsMessageHandler;
    }

    public final void accept(Object obj) {
        SilkHomescreenShortcutsMessageHandler silkHomescreenShortcutsMessageHandler = this.f106959a;
        ((PostMessageMixinImpl) silkHomescreenShortcutsMessageHandler.f106951c).mo46952c(R.id.install_shortcut, C40802d.f106956a, new C40803e(silkHomescreenShortcutsMessageHandler, (C41727a) obj), true, C41743a.f109088b);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
