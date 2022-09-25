package com.google.android.apps.gsa.settingsui;

import android.preference.Preference;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import java.util.Timer;

/* renamed from: com.google.android.apps.gsa.settingsui.k */
/* compiled from: PG */
final class C88996k implements ViewGroup.OnHierarchyChangeListener {

    /* renamed from: a */
    final /* synthetic */ ListView f241171a;

    /* renamed from: b */
    final /* synthetic */ String f241172b;

    /* renamed from: c */
    final /* synthetic */ SettingsPreferenceFragment f241173c;

    public C88996k(SettingsPreferenceFragment settingsPreferenceFragment, ListView listView, String str) {
        this.f241173c = settingsPreferenceFragment;
        this.f241171a = listView;
        this.f241172b = str;
    }

    public final void onChildViewRemoved(View view, View view2) {
    }

    public final void onChildViewAdded(View view, View view2) {
        SettingsPreferenceFragment settingsPreferenceFragment = this.f241173c;
        ListView listView = this.f241171a;
        String str = this.f241172b;
        if (str != null && !settingsPreferenceFragment.f241150k) {
            ListAdapter adapter = listView.getAdapter();
            int i = 0;
            while (true) {
                if (i >= adapter.getCount()) {
                    i = -1;
                    break;
                }
                Preference preference = (Preference) adapter.getItem(i);
                CharSequence title = preference.getTitle();
                CharSequence summary = preference.getSummary();
                if ((title != null && title.toString().equals(str)) || (summary != null && summary.toString().equals(str))) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                settingsPreferenceFragment.f241150k = true;
                new Timer().schedule(new C88997l(listView, i), 500);
            }
        }
        SettingsPreferenceFragment settingsPreferenceFragment2 = this.f241173c;
        String str2 = this.f241172b;
        if (str2 != null && !settingsPreferenceFragment2.f241149j) {
            TextView textView = (TextView) view2.findViewById(16908310);
            TextView textView2 = (TextView) view2.findViewById(16908304);
            if (textView != null && textView.getText().toString().equals(str2)) {
                settingsPreferenceFragment2.mo82937e(view2);
                settingsPreferenceFragment2.f241149j = true;
            }
            if (textView2 != null && textView2.getText().toString().equals(str2)) {
                settingsPreferenceFragment2.mo82937e(view2);
                settingsPreferenceFragment2.f241149j = true;
            }
        }
    }
}
