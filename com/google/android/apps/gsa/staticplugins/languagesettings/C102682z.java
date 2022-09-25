package com.google.android.apps.gsa.staticplugins.languagesettings;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58495hd;
import com.google.p395al.p408c.p414c.p416b.C8506p;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.languagesettings.z */
/* compiled from: PG */
final class C102682z extends ArrayAdapter {

    /* renamed from: a */
    private final C102655aa f286609a;

    public C102682z(C102655aa aaVar, Context context, List list) {
        super(context, 0, list);
        this.f286609a = aaVar;
    }

    public final int getItemViewType(int i) {
        return ((C102681y) getItem(i)).f286608d - 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C8506p pVar;
        C102681y yVar = (C102681y) getItem(i);
        int i2 = 0;
        if (view == null) {
            if (yVar.f286608d == 1) {
                view = LayoutInflater.from(getContext()).inflate(R.layout.search_language_preference, viewGroup, false);
            } else {
                view = LayoutInflater.from(getContext()).inflate(R.layout.search_language_preference_section_header, viewGroup, false);
            }
        }
        int i3 = yVar.f286608d;
        if (i3 == 2) {
            ((TextView) view.findViewById(R.id.search_language_preference_section_header_text)).setText(R.string.search_language_preference_suggested_header);
        } else if (i3 == 3) {
            ((TextView) view.findViewById(R.id.search_language_preference_section_header_text)).setText(R.string.search_language_preference_all_header);
        } else {
            String str = yVar.f286605a;
            if (!(str == null || (pVar = yVar.f286606b) == null)) {
                C102655aa aaVar = this.f286609a;
                boolean z = yVar.f286607c;
                C58495hd hdVar = C102655aa.f286542a;
                String str2 = pVar.f29513a;
                TextView textView = (TextView) view.findViewById(R.id.search_language_preference_text);
                textView.setTextDirection(3);
                textView.setText(str2);
                TextView textView2 = (TextView) view.findViewById(R.id.search_language_preference_subtitle);
                Locale forLanguageTag = Locale.forLanguageTag(str);
                textView2.setTextDirection(3);
                String displayName = forLanguageTag.getDisplayName();
                if (!TextUtils.isEmpty(displayName) && !displayName.equals(forLanguageTag.getLanguage())) {
                    textView2.setText(displayName);
                    textView2.setVisibility(0);
                }
                ImageView imageView = (ImageView) view.findViewById(R.id.search_language_selected_check);
                if (true == str.equals(aaVar.f286544c.getString("hl_parameter", BuildConfig.FLAVOR))) {
                    i2 = R.drawable.ic_check;
                }
                imageView.setImageResource(i2);
                view.setOnClickListener(new C102680x(aaVar, str2, z, pVar));
            }
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 3;
    }

    public final boolean isEnabled(int i) {
        return ((C102681y) getItem(i)).f286608d == 1;
    }
}
