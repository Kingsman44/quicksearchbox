package com.google.android.apps.gsa.search.core.preferences.cards;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.google.android.apps.gsa.search.shared.contact.Person;
import com.google.android.apps.gsa.search.shared.contact.Relationship;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.core.preferences.cards.j */
/* compiled from: PG */
final class C86312j extends BaseAdapter {

    /* renamed from: a */
    final List f233364a = new ArrayList();

    /* renamed from: b */
    final LayoutInflater f233365b;

    /* renamed from: c */
    final /* synthetic */ RelationshipSettingsFragment f233366c;

    public C86312j(RelationshipSettingsFragment relationshipSettingsFragment, LayoutInflater layoutInflater) {
        this.f233366c = relationshipSettingsFragment;
        this.f233365b = layoutInflater;
        new C86310h(this, relationshipSettingsFragment.f233350g).mo85242e(new Void[0]);
    }

    public final int getCount() {
        return this.f233364a.size();
    }

    public final Object getItem(int i) {
        return this.f233364a.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        RelationshipListItem relationshipListItem;
        if (view == null) {
            relationshipListItem = (RelationshipListItem) this.f233365b.inflate(R.layout.relationship_list_item, (ViewGroup) null);
        } else {
            relationshipListItem = (RelationshipListItem) view;
        }
        C86308f fVar = (C86308f) this.f233364a.get(i);
        Person person = fVar.f233359b;
        Relationship relationship = fVar.f233358a;
        relationshipListItem.f233343b.setText(person.f236373d);
        relationshipListItem.f233342a.setText(relationship.mo81589a(relationship.f236405a));
        return relationshipListItem;
    }
}
