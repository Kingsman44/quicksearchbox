package com.google.android.apps.gsa.assistant.settings.features.news;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.settings.base.AssistantSettingsPreferenceFragmentBase;
import com.google.android.apps.gsa.assistant.settings.base.C9504g;
import com.google.android.apps.gsa.assistant.shared.p5817h.C73873e;
import com.google.android.apps.gsa.shared.util.C90743b;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.news.z */
/* compiled from: PG */
public final class C73235z extends AssistantSettingsPreferenceFragmentBase {

    /* renamed from: h */
    public C90743b f194062h;

    /* renamed from: i */
    public C73230u f194063i;

    /* renamed from: j */
    public r f194064j;

    /* renamed from: k */
    private boolean f194065k;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final int mo17765n() {
        return 0;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ Activity mo17766o() {
        return super.getActivity();
    }

    public final void onCreate(Bundle bundle) {
        C73873e.m108454a(this);
        super.onCreate(bundle);
        this.f194065k = this.f194062h.f253818a.isEnabled();
    }

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.news.z.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
        /*
        // Can't load method instructions: Load method exception: null in method: com.google.android.apps.gsa.assistant.settings.features.news.z.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View, dex: classes4.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.assistant.settings.features.news.C73235z.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C9504g mo17768q() {
        return this.f194063i;
    }
}
