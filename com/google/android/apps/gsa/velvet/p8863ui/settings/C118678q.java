package com.google.android.apps.gsa.velvet.p8863ui.settings;

import android.content.Context;
import android.preference.PreferenceActivity;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.velvet.ui.settings.q */
/* compiled from: PG */
final class C118678q extends ArrayAdapter {

    /* renamed from: a */
    private final LayoutInflater f331068a;

    public C118678q(Context context, List list) {
        super(context, 0, list);
        this.f331068a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    /* renamed from: b */
    private static int m197018b(PreferenceActivity.Header header) {
        if (header.fragmentArguments != null && header.fragmentArguments.containsKey("TYPE_SWITCH")) {
            return 2;
        }
        if (SettingsActivity.m196927b(header.id) != null) {
            SettingsActivity.m196927b(header.id).getClass();
            return (header.extras == null || !header.extras.getBoolean("IS_VISIBLE", false)) ? 3 : 4;
        } else if (header.fragment == null && header.intent == null) {
            return 0;
        } else {
            return 1;
        }
    }

    /* renamed from: a */
    public final void mo103856a(PreferenceActivity.Header header, boolean z) {
        header.extras.putBoolean("value", z);
        getContext().getContentResolver().call(SettingsActivity.f330930b, "set_boolean_setting", header.fragmentArguments.getString("LAUNCHER_PREF_KEY"), header.extras);
    }

    public final boolean areAllItemsEnabled() {
        return false;
    }

    public final int getItemViewType(int i) {
        return m197018b((PreferenceActivity.Header) getItem(i));
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        C118677p pVar;
        View view2;
        PreferenceActivity.Header header = (PreferenceActivity.Header) getItem(i);
        int b = m197018b(header);
        if (view == null) {
            C118677p pVar2 = new C118677p();
            if (b == 0) {
                return new View(getContext());
            }
            if (b == 2) {
                view2 = this.f331068a.inflate(R.layout.preference_header_switch_item, viewGroup, false);
                pVar2.f331064a = (ImageView) view2.findViewById(R.id.icon);
                pVar2.f331065b = (TextView) view2.findViewById(16908310);
                pVar2.f331066c = (TextView) view2.findViewById(16908304);
                pVar2.f331067d = (Switch) view2.findViewById(R.id.switchWidget);
                pVar2.f331067d.setClickable(false);
                pVar2.f331067d.setFocusable(false);
                view2.setOnClickListener(new C118674m());
            } else if (b != 3) {
                view2 = this.f331068a.inflate(R.layout.hub_preference_header_item, viewGroup, false);
                pVar2.f331064a = (ImageView) view2.findViewById(R.id.icon);
                pVar2.f331065b = (TextView) view2.findViewById(16908310);
                pVar2.f331066c = (TextView) view2.findViewById(16908304);
            } else {
                View view3 = new View(getContext());
                view3.setTag(pVar2);
                return view3;
            }
            view2.setTag(pVar2);
            View view4 = view2;
            pVar = pVar2;
            view = view4;
        } else {
            if (b == 1) {
                if (view.hasOnClickListeners()) {
                    view.setOnClickListener((View.OnClickListener) null);
                    view.setClickable(false);
                }
                b = 1;
            }
            Object tag = view.getTag();
            tag.getClass();
            pVar = (C118677p) tag;
        }
        if (b == 0) {
            return new View(getContext());
        }
        if (b != 3) {
            pVar.f331065b.setAccessibilityDelegate(new C118658l(i));
            Spanned fromHtml = Html.fromHtml(header.getTitle(getContext().getResources()).toString());
            pVar.f331065b.setText(fromHtml);
            pVar.f331065b.setContentDescription(fromHtml);
            boolean z = header.iconRes == 0 && pVar.f331064a.getDrawable() != null;
            pVar.f331064a.setImageResource(header.iconRes);
            if (z) {
                pVar.f331064a.requestLayout();
            }
            CharSequence summary = header.getSummary(getContext().getResources());
            if (!TextUtils.isEmpty(summary)) {
                pVar.f331066c.setVisibility(0);
                pVar.f331066c.setText(summary);
            } else {
                pVar.f331066c.setVisibility(8);
            }
            if (!(header.fragmentArguments == null || header.extras == null || !header.fragmentArguments.containsKey("LAUNCHER_PREF_KEY"))) {
                if (header.extras == null) {
                    view.setEnabled(false);
                    pVar.f331067d.setChecked(false);
                } else {
                    view.setEnabled(true);
                    pVar.f331067d.setChecked(header.extras.getBoolean("value"));
                    pVar.f331067d.setOnCheckedChangeListener(new C118675n(this, header));
                }
            }
        }
        return view;
    }

    public final int getViewTypeCount() {
        return 5;
    }

    public final boolean hasStableIds() {
        return true;
    }

    public final boolean isEnabled(int i) {
        return m197018b((PreferenceActivity.Header) getItem(i)) != 0;
    }
}
