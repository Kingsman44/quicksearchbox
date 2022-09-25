package com.google.android.apps.gsa.staticplugins.opa.ambient.activity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.p7066m.C90017bw;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.search.assistant.verticals.ambient.p10017u.p10018a.C131829n;
import com.google.android.apps.search.assistant.verticals.ambient.p9935m.C130895ag;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* compiled from: PG */
public final class AmbientAssistantFeedbackFragment extends C106403ad {

    /* renamed from: a */
    public C106428w f296773a;

    /* renamed from: b */
    public Optional f296774b;

    /* renamed from: c */
    public C90021c f296775c;

    /* renamed from: d */
    public C130895ag f296776d;

    /* renamed from: e */
    public CheckBox f296777e;

    /* renamed from: f */
    public Spinner f296778f;

    /* renamed from: g */
    public Button f296779g;

    /* renamed from: h */
    public RadioGroup f296780h;

    /* renamed from: i */
    public RadioGroup f296781i;

    /* renamed from: j */
    public EditText f296782j;

    /* renamed from: k */
    public RadioGroup f296783k;

    /* renamed from: l */
    public RadioGroup f296784l;

    /* renamed from: m */
    public RadioButton f296785m;

    /* renamed from: n */
    public TextView f296786n;

    /* renamed from: o */
    public TextView f296787o;

    /* renamed from: p */
    public RadioGroup f296788p;

    /* renamed from: q */
    public TextView f296789q;

    /* renamed from: r */
    public RadioGroup f296790r;

    /* renamed from: s */
    public boolean f296791s = false;

    /* renamed from: t */
    private ViewGroup f296792t;

    /* renamed from: u */
    private CheckBox f296793u;

    /* renamed from: v */
    private TextView f296794v;

    /* renamed from: w */
    private EditText f296795w;

    public AmbientAssistantFeedbackFragment() {
        super(R.layout.aa_feedback_fragment);
    }

    /* renamed from: g */
    private static String m177192g(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) ((Pair) list.get(0)).second;
    }

    /* renamed from: h */
    private static void m177193h(RadioGroup radioGroup, RadioButton radioButton, EditText editText) {
        radioGroup.setOnCheckedChangeListener(new C106423r(editText, radioButton));
    }

    /* renamed from: i */
    private static boolean m177194i(TextView textView, List list) {
        String g = m177192g(list);
        if (g == null) {
            return false;
        }
        textView.setText(g);
        return true;
    }

    /* renamed from: j */
    private static boolean m177195j(RadioGroup radioGroup, TextView textView, List list, LayoutInflater layoutInflater) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        radioGroup.setTag(((Pair) list.get(0)).first);
        textView.setText((CharSequence) ((Pair) list.get(0)).second);
        for (int i = 1; i < list.size(); i++) {
            RadioButton radioButton = (RadioButton) layoutInflater.inflate(R.layout.aa_feedback_radiobutton, radioGroup, false);
            radioButton.setTag(((Pair) list.get(i)).first);
            radioButton.setText((CharSequence) ((Pair) list.get(i)).second);
            radioGroup.addView(radioButton, i - 1);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C58495hd mo95505a() {
        if (this.f296792t == null) {
            return C58729pv.f156485a;
        }
        C58490gz gzVar = new C58490gz(4);
        for (int i = 0; i < this.f296792t.getChildCount(); i++) {
            View childAt = this.f296792t.getChildAt(i);
            if (childAt instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) childAt;
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                for (int i2 = 0; i2 < radioGroup.getChildCount(); i2++) {
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i2);
                    if (!(radioButton.getId() != checkedRadioButtonId || radioGroup.getTag() == null || radioButton.getTag() == null)) {
                        if (radioGroup.getTag().toString().equals("location_feature")) {
                            gzVar.mo55429h("feature", radioButton.getTag().toString());
                        } else if (radioGroup.getTag().toString().equals("location_issue")) {
                            this.f296776d.mo109880P(radioButton.getText().toString());
                            gzVar.mo55429h("issue", radioButton.getTag().toString());
                        } else if (radioGroup.getTag().toString().equals("location_accuracy_issue")) {
                            this.f296776d.mo109880P(radioButton.getText().toString());
                            gzVar.mo55429h("location_accuracy_issue", radioButton.getTag().toString());
                        } else if (radioGroup.getTag().toString().equals("location_latency_issue")) {
                            this.f296776d.mo109880P(radioButton.getText().toString());
                            gzVar.mo55429h("location_latency_issue", radioButton.getTag().toString());
                        } else {
                            gzVar.mo55429h(radioGroup.getTag().toString(), radioButton.getTag().toString());
                        }
                    }
                }
            }
        }
        return gzVar.mo55427f(false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final String mo95506b() {
        if (this.f296792t == null) {
            return BuildConfig.FLAVOR;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f296792t.getChildCount(); i++) {
            View childAt = this.f296792t.getChildAt(i);
            if (childAt instanceof RadioGroup) {
                RadioGroup radioGroup = (RadioGroup) childAt;
                if (this.f296785m.isChecked() || !(radioGroup == this.f296788p || radioGroup == this.f296790r)) {
                    int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                    for (int i2 = 0; i2 < radioGroup.getChildCount(); i2++) {
                        RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i2);
                        if (radioButton.getId() == checkedRadioButtonId) {
                            sb.append("[x] ");
                            sb.append(radioButton.getText());
                            sb.append("\n");
                            if (!(radioButton.getTag() == null || radioGroup.getTag() == null)) {
                                arrayList.add(radioButton.getTag().toString());
                            }
                        }
                    }
                }
            } else if (childAt instanceof EditText) {
                if (childAt.isEnabled()) {
                    String trim = ((EditText) childAt).getText().toString().trim();
                    if (!trim.isEmpty()) {
                        sb.append(trim);
                        sb.append("\n");
                        arrayList.add(trim);
                    } else {
                        sb.append("(no input)\n");
                    }
                }
            } else if (!(!(childAt instanceof TextView) || childAt == this.f296794v || childAt == this.f296779g || childAt == this.f296786n || (!this.f296785m.isChecked() && (childAt == this.f296787o || childAt == this.f296789q)))) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(((TextView) childAt).getText());
                sb.append("\n");
            }
        }
        String obj = sb.toString();
        return "Feedback form: " + ((String) Collection.EL.stream(arrayList).collect(Collectors.joining(", "))) + "\n\n" + obj;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo95507d() {
        CheckBox checkBox = this.f296793u;
        return checkBox != null && checkBox.isChecked();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TextView textView;
        LayoutInflater layoutInflater2 = layoutInflater;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        HashMap hashMap = null;
        if (onCreateView == null) {
            return null;
        }
        String x = this.f296775c.mo79758x(C90017bw.f247983bs);
        if (!C58837ba.m90859h(x)) {
            hashMap = new HashMap();
            for (String split : x.split("##", -1)) {
                String[] split2 = split.split("#", -1);
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < split2.length - 1; i += 2) {
                    arrayList.add(new Pair(split2[i], split2[i + 1]));
                }
                hashMap.put(split2[0], arrayList);
            }
        }
        if (hashMap == null) {
            this.f296773a.mo95526a(getActivity(), mo95506b(), mo95505a(), Optional.m71637of(Duration.ofMinutes(30)), mo95507d(), (Bitmap) null);
            return onCreateView;
        }
        this.f296786n = (TextView) onCreateView.findViewById(R.id.feedback_heading_location_button);
        this.f296779g = (Button) onCreateView.findViewById(R.id.location_feedback_button);
        this.f296787o = (TextView) onCreateView.findViewById(R.id.feedback_heading_accuracy_issue_location_card);
        this.f296788p = (RadioGroup) onCreateView.findViewById(R.id.feedback_group_accuracy_issue_location_card);
        this.f296789q = (TextView) onCreateView.findViewById(R.id.feedback_heading_latency_issue_location_card);
        this.f296790r = (RadioGroup) onCreateView.findViewById(R.id.feedback_group_latency_issue_location_card);
        this.f296785m = (RadioButton) onCreateView.findViewById(R.id.feedback_context_location_card);
        if (this.f296775c.mo79746e(C90017bw.f247931at)) {
            this.f296780h = (RadioGroup) onCreateView.findViewById(R.id.feedback_group_context);
            this.f296781i = (RadioGroup) onCreateView.findViewById(R.id.feedback_group_context_location_card);
            this.f296782j = (EditText) onCreateView.findViewById(R.id.feedback_context_other_text);
            this.f296795w = (EditText) onCreateView.findViewById(R.id.feedback_issue_other_text);
            this.f296783k = (RadioGroup) onCreateView.findViewById(R.id.feedback_group_issue);
            this.f296784l = (RadioGroup) onCreateView.findViewById(R.id.feedback_group_issue_location_card);
            TextView textView2 = this.f296786n;
            textView2.getClass();
            textView2.setVisibility(0);
            Button button = this.f296779g;
            button.getClass();
            button.setVisibility(0);
            EditText editText = this.f296795w;
            editText.getClass();
            editText.setVisibility(8);
            Button button2 = this.f296779g;
            button2.getClass();
            button2.setOnClickListener(new C106421p(this));
            RadioGroup radioGroup = this.f296784l;
            radioGroup.getClass();
            radioGroup.setOnCheckedChangeListener(new C106424s(this));
        }
        if (m177195j((RadioGroup) onCreateView.findViewById(R.id.feedback_group_context), (TextView) onCreateView.findViewById(R.id.feedback_heading_context), (List) hashMap.get("feature"), layoutInflater2) && m177195j((RadioGroup) onCreateView.findViewById(R.id.feedback_group_issue), (TextView) onCreateView.findViewById(R.id.feedback_heading_issue), (List) hashMap.get("issue"), layoutInflater2) && m177195j((RadioGroup) onCreateView.findViewById(R.id.feedback_group_issue_location_card), (TextView) onCreateView.findViewById(R.id.feedback_heading_issue), (List) hashMap.get("location_issue"), layoutInflater2) && m177195j((RadioGroup) onCreateView.findViewById(R.id.feedback_group_accuracy_issue_location_card), (TextView) onCreateView.findViewById(R.id.feedback_heading_accuracy_issue_location_card), (List) hashMap.get("location_accuracy_issue"), layoutInflater2) && m177195j((RadioGroup) onCreateView.findViewById(R.id.feedback_group_latency_issue_location_card), (TextView) onCreateView.findViewById(R.id.feedback_heading_latency_issue_location_card), (List) hashMap.get("location_latency_issue"), layoutInflater2) && m177194i((TextView) onCreateView.findViewById(R.id.feedback_heading_details), (List) hashMap.get("details")) && m177194i((TextView) onCreateView.findViewById(R.id.feedback_heading_ideas), (List) hashMap.get("ideas")) && m177194i((TextView) onCreateView.findViewById(R.id.feedback_location_history_label), (List) hashMap.get("location_history")) && m177194i((TextView) onCreateView.findViewById(R.id.feedback_personalization_data_label), (List) hashMap.get("personalization_data"))) {
            this.f296792t = (ViewGroup) onCreateView.findViewById(R.id.feedback_form);
            TextView textView3 = (TextView) onCreateView.findViewById(R.id.feedback_location_history_label);
            this.f296777e = (CheckBox) onCreateView.findViewById(R.id.feedback_location_history_checkbox);
            this.f296778f = (Spinner) onCreateView.findViewById(R.id.feedback_location_history_spinner);
            this.f296793u = (CheckBox) onCreateView.findViewById(R.id.feedback_contextual_data_checkbox);
            CheckBox checkBox = this.f296777e;
            checkBox.getClass();
            checkBox.setChecked(false);
            if (this.f296774b.isEmpty() || !((C131829n) this.f296774b.get()).mo110327a().mo110332c()) {
                CheckBox checkBox2 = this.f296777e;
                checkBox2.getClass();
                checkBox2.setChecked(false);
                CheckBox checkBox3 = this.f296777e;
                checkBox3.getClass();
                checkBox3.setVisibility(8);
                Spinner spinner = this.f296778f;
                spinner.getClass();
                spinner.setVisibility(8);
                textView3.setVisibility(8);
            } else if (!((C131829n) this.f296774b.get()).mo110327a().mo110330a()) {
                double seconds = (double) ((C131829n) this.f296774b.get()).mo110329c().toSeconds();
                Double.isNaN(seconds);
                long ceil = (long) Math.ceil(seconds / 60.0d);
                String g = m177192g((List) hashMap.get("location_history"));
                g.getClass();
                Locale locale = Locale.US;
                Object[] objArr = new Object[3];
                objArr[0] = g;
                objArr[1] = Long.valueOf(ceil);
                objArr[2] = ceil == 1 ? BuildConfig.FLAVOR : C59002s.f156871a;
                textView3.setText(String.format(locale, "%s (%d minute%s)", objArr));
                Spinner spinner2 = this.f296778f;
                spinner2.getClass();
                spinner2.setVisibility(8);
            }
            ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(getContext(), R.array.feedback_location_history_labels, 17367048);
            createFromResource.setDropDownViewResource(17367049);
            Spinner spinner3 = this.f296778f;
            if (spinner3 != null) {
                spinner3.setAdapter(createFromResource);
                this.f296778f.setSelection(getResources().getInteger(R.integer.feedback_location_history_default));
            }
            m177193h((RadioGroup) onCreateView.findViewById(R.id.feedback_group_context), (RadioButton) onCreateView.findViewById(R.id.feedback_context_other), (EditText) onCreateView.findViewById(R.id.feedback_context_other_text));
            m177193h((RadioGroup) onCreateView.findViewById(R.id.feedback_group_issue), (RadioButton) onCreateView.findViewById(R.id.feedback_issue_other), (EditText) onCreateView.findViewById(R.id.feedback_issue_other_text));
            this.f296794v = (TextView) onCreateView.findViewById(R.id.feedback_verify_location);
            if (this.f296775c.mo79746e(C90017bw.f247932au) && (textView = this.f296794v) != null) {
                textView.setVisibility(0);
                this.f296794v.setOnClickListener(new C106422q(this));
            }
            this.f296791s = true;
        }
        return onCreateView;
    }
}
