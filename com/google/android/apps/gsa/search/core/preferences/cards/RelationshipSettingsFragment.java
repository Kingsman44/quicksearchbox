package com.google.android.apps.gsa.search.core.preferences.cards;

import android.app.FragmentManager;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.google.android.apps.gsa.contacts.bg;
import com.google.android.apps.gsa.search.core.C85741ce;
import com.google.android.apps.gsa.search.core.p6502ae.p6503a.C84418a;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4526f.C59071e;

/* compiled from: PG */
public class RelationshipSettingsFragment extends ListFragment {

    /* renamed from: a */
    public static final C59071e f233344a = C59071e.m91332i("com.google.android.apps.gsa.search.core.preferences.cards.RelationshipSettingsFragment");

    /* renamed from: b */
    public C86312j f233345b;

    /* renamed from: c */
    public View f233346c;

    /* renamed from: d */
    public bg f233347d;

    /* renamed from: e */
    public C84418a f233348e;

    /* renamed from: f */
    public C85741ce f233349f;

    /* renamed from: g */
    public C90929bz f233350g;

    /* renamed from: com.google.android.apps.gsa.search.core.preferences.cards.RelationshipSettingsFragment$a */
    /* compiled from: PG */
    public interface C86302a {
        /* renamed from: qk */
        void mo80016qk(RelationshipSettingsFragment relationshipSettingsFragment);
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        C86312j jVar = new C86312j(this, getActivity().getLayoutInflater());
        this.f233345b = jVar;
        setListAdapter(jVar);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((C86302a) C47266f.m84076a(getActivity().getApplication(), C86302a.class)).mo80016qk(this);
        this.f233347d = this.f233348e.mo77984a();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C86305c cVar;
        View inflate = layoutInflater.inflate(R.layout.relationship_list, (ViewGroup) null);
        inflate.findViewById(R.id.learn_more_about_relationship).setOnClickListener(new C86306d(this));
        this.f233346c = inflate.findViewById(R.id.empty_relationship_view);
        FragmentManager fragmentManager = getFragmentManager();
        if (!(fragmentManager == null || (cVar = (C86305c) fragmentManager.findFragmentByTag("remove-relationship")) == null)) {
            cVar.f233355d = new C86307e(this);
        }
        return inflate;
    }

    public final void onListItemClick(ListView listView, View view, int i, long j) {
        C86308f fVar = (C86308f) listView.getItemAtPosition(i);
        C86305c cVar = new C86305c();
        cVar.f233355d = new C86307e(this);
        String str = fVar.f233359b.f236373d;
        String str2 = fVar.f233358a.f236405a;
        cVar.f233352a = str;
        cVar.f233353b = str2;
        cVar.f233354c = i;
        cVar.show(getFragmentManager(), "remove-relationship");
    }
}
