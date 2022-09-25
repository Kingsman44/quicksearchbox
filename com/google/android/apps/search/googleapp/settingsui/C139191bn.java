package com.google.android.apps.search.googleapp.settingsui;

import android.support.p031v4.app.Fragment;
import android.support.p033v7.widget.RecyclerView;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.search.googleapp.p10536x.C139868d;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.p10536x.C139878n;
import com.google.android.apps.search.googleapp.p10536x.C139879o;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.inject.C47231d;
import java.util.Map;
import java.util.Set;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.bn */
/* compiled from: PG */
public final class C139191bn implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C139192bo f378548a;

    public C139191bn(C139192bo boVar) {
        this.f378548a = boVar;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, "throwable");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        Set set = (Set) obj;
        C69664n.m101061g(set, "matchingSettings");
        C139192bo boVar = this.f378548a;
        PreferenceScreen gi = boVar.f378550b.mo8412gi();
        gi.mo8376ac();
        for (Map.Entry entry : boVar.f378560l.entrySet()) {
            C139873i iVar = (C139873i) entry.getKey();
            Preference preference = (Preference) entry.getValue();
            if (set.contains(iVar)) {
                gi.mo8379af(preference);
                String name = iVar.name();
                if (name == null) {
                    throw new IllegalStateException("Required value was null.");
                } else if (!boVar.f378558j.contains(name)) {
                    C139873i a = C139873i.m227462a(name);
                    Preference preference2 = (Preference) C69505av.m100865g(boVar.f378560l, a);
                    C139879o oVar = (C139879o) C69505av.m100865g(boVar.f378551c, a);
                    if (oVar.mo111452a() > 0) {
                        C28439i a2 = boVar.mo114810a().mo33907a(preference2, boVar.f378554f.mo33805a(C28427h.m53115a(oVar.mo111452a())));
                        Fragment c = boVar.f378550b.getChildFragmentManager().f634a.mo671c(name);
                        C69664n.m101059e(c, "null cannot be cast to non-null type com.google.apps.tiktok.inject.PeeredInterface<com.google.android.apps.search.googleapp.settings.PreferenceFragmentPeer>");
                        C69664n.m101060f(a2, "ve");
                        ((C139878n) ((C47231d) c).mo17754z()).mo112668b(a2);
                        boVar.f378558j.add(name);
                    } else if (!(oVar instanceof C139868d)) {
                        throw new IllegalArgumentException("veId must be set for non-CustomSettingUiElements");
                    }
                } else {
                    continue;
                }
            } else if (boVar.f378558j.contains(iVar.name())) {
                boVar.f378558j.remove(iVar.name());
                String name2 = iVar.name();
                if (name2 != null) {
                    boVar.mo114810a().mo33911e(C69505av.m100865g(boVar.f378560l, C139873i.m227462a(name2)));
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                continue;
            }
        }
        RecyclerView recyclerView = boVar.f378550b.f12808c;
        recyclerView.setAdapter(recyclerView.mAdapter);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
