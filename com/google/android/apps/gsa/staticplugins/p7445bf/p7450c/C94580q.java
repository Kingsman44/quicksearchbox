package com.google.android.apps.gsa.staticplugins.p7445bf.p7450c;

import android.os.Bundle;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.LegacyOpaStandardPage;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28291i;
import com.google.assistant.p3861at.C49946ew;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bf.c.q */
/* compiled from: PG */
public final class C94580q extends C83907bm implements C94570g, C94563aa {

    /* renamed from: b */
    public C94583t f264548b;

    /* renamed from: c */
    public C94564ab f264549c;

    /* renamed from: d */
    public C49946ew f264550d;

    /* renamed from: e */
    public C94575l f264551e;

    /* renamed from: f */
    private C28291i f264552f;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        C58838bb.m90866a(arguments, "Must call setArguments(Bundle)");
        try {
            this.f264550d = (C49946ew) C62942bv.parseFrom((C62942bv) C49946ew.f129824q, (byte[]) C58838bb.m90867b(arguments.getByteArray("voice_settings_ui"), "Arguments must contain AssistantVoiceSettingsUi under key %s", "voice_settings_ui"), C62921ba.m95368a());
            C49946ew ewVar = this.f264550d;
            this.f264551e = new C94575l(ewVar.f129827b, ewVar.f129828c, this);
        } catch (C62974ct e) {
            throw new IllegalArgumentException("Could not deserialize AssistantVoiceSettingsUi", e);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LegacyOpaStandardPage legacyOpaStandardPage = (LegacyOpaStandardPage) layoutInflater.inflate(R.layout.voice_selection, viewGroup, false);
        legacyOpaStandardPage.f228725d.mo77360a().setOnClickListener(new C89943l(new C94576m(this)));
        RecyclerView recyclerView = legacyOpaStandardPage.f228724c.f228894q;
        recyclerView.setVisibility(0);
        recyclerView.setAdapter(this.f264551e);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.mHasFixedSize = true;
        this.f264551e.mObservable.mo2879a();
        C28291i iVar = new C28291i(recyclerView, new C94579p());
        this.f264552f = iVar;
        C94575l lVar = this.f264551e;
        Objects.requireNonNull(lVar);
        iVar.f76970d = new C94577n(lVar);
        C28291i iVar2 = this.f264552f;
        iVar2.f76971e = new C94578o(this);
        iVar2.mo33786b();
        return legacyOpaStandardPage;
    }
}
