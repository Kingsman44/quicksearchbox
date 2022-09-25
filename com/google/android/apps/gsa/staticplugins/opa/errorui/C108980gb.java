package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.app.TimePickerDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.android.apps.gsa.assistant.shared.C73841bf;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.p6463ui.OpaPageLayout;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87250s;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C90053de;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.gb */
/* compiled from: PG */
public final class C108980gb extends C83907bm {

    /* renamed from: b */
    public static final C59071e f303029b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.gb");

    /* renamed from: c */
    public static final Uri f303030c = Uri.parse("clock-app://com.google.android.deskclock/alarm");

    /* renamed from: d */
    public static final C58495hd f303031d;

    /* renamed from: v */
    private static final ThreadLocal f303032v = new C108973fv();

    /* renamed from: w */
    private static final ThreadLocal f303033w = new C108974fw();

    /* renamed from: x */
    private static final C58495hd f303034x;

    /* renamed from: A */
    private CheckBox f303035A;

    /* renamed from: B */
    private CheckBox f303036B;

    /* renamed from: C */
    private CheckBox f303037C;

    /* renamed from: D */
    private CheckBox f303038D;

    /* renamed from: E */
    private TextView f303039E;

    /* renamed from: e */
    public C86124t f303040e;

    /* renamed from: f */
    public C22871g f303041f;

    /* renamed from: g */
    public C87250s f303042g;

    /* renamed from: h */
    public C68214a f303043h;

    /* renamed from: i */
    public SharedPreferences f303044i;

    /* renamed from: j */
    public boolean f303045j;

    /* renamed from: k */
    public boolean f303046k;

    /* renamed from: l */
    public final Calendar f303047l = Calendar.getInstance();

    /* renamed from: m */
    public TimePickerDialog f303048m;

    /* renamed from: n */
    public TextView f303049n;

    /* renamed from: o */
    public TextView f303050o;

    /* renamed from: p */
    public LinearLayout f303051p;

    /* renamed from: q */
    public Boolean f303052q;

    /* renamed from: r */
    public Context f303053r;

    /* renamed from: s */
    public Context f303054s;

    /* renamed from: t */
    public C104149a f303055t;

    /* renamed from: u */
    public C84466a f303056u;

    /* renamed from: y */
    private final DateFormatSymbols f303057y = new DateFormatSymbols();

    /* renamed from: z */
    private OpaPageLayout f303058z;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(Integer.valueOf(R.id.wakeup_routine_time_picker_sunday), 1);
        gzVar.mo55429h(Integer.valueOf(R.id.wakeup_routine_time_picker_monday), 2);
        gzVar.mo55429h(Integer.valueOf(R.id.wakeup_routine_time_picker_tuesday), 3);
        gzVar.mo55429h(Integer.valueOf(R.id.wakeup_routine_time_picker_wednesday), 4);
        gzVar.mo55429h(Integer.valueOf(R.id.wakeup_routine_time_picker_thursady), 5);
        gzVar.mo55429h(Integer.valueOf(R.id.wakeup_routine_time_picker_friday), 6);
        gzVar.mo55429h(Integer.valueOf(R.id.wakeup_routine_time_picker_saturday), 7);
        f303034x = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h(1, "Sunday");
        gzVar2.mo55429h(2, "Monday");
        gzVar2.mo55429h(3, "Tuesday");
        gzVar2.mo55429h(4, "Wednesday");
        gzVar2.mo55429h(5, "Thursday");
        gzVar2.mo55429h(6, "Friday");
        gzVar2.mo55429h(7, "Saturday");
        f303031d = gzVar2.mo55427f(false);
    }

    /* renamed from: l */
    private final String m181248l() {
        if (DateFormat.is24HourFormat(this.f303053r)) {
            return ((SimpleDateFormat) f303033w.get()).format(this.f303047l.getTime());
        }
        return ((SimpleDateFormat) f303032v.get()).format(this.f303047l.getTime());
    }

    /* renamed from: m */
    private final boolean m181249m() {
        if (!this.f303035A.isChecked() && !this.f303036B.isChecked() && !this.f303038D.isChecked() && !this.f303037C.isChecked()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    /* renamed from: e */
    public final ArrayList mo97337e() {
        ArrayList arrayList = new ArrayList();
        C58800sl lA = f303034x.entrySet().iterator();
        while (lA.hasNext()) {
            Map.Entry entry = (Map.Entry) lA.next();
            if (((ToggleButton) this.f303058z.findViewById(((Integer) entry.getKey()).intValue())).isChecked()) {
                arrayList.add((Integer) entry.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public final void mo97338g() {
        this.f303044i.edit().putInt("opa_wakeup_routine_opt_in_status", 2).apply();
        if (this.f303035A.isChecked()) {
            C89949q.m146521e(C28285c.m52882i(this.f303035A, 5, (Integer) null), false);
        }
        if (this.f303038D.isChecked()) {
            C89949q.m146521e(C28285c.m52882i(this.f303038D, 5, (Integer) null), false);
        }
        if (this.f303036B.isChecked()) {
            C89949q.m146521e(C28285c.m52882i(this.f303036B, 5, (Integer) null), false);
        }
        if (this.f303037C.isChecked()) {
            C89949q.m146521e(C28285c.m52882i(this.f303037C, 5, (Integer) null), false);
        }
        if (m181249m()) {
            try {
                ArrayList arrayList = new ArrayList();
                if (this.f303035A.isChecked()) {
                    arrayList.add("show_weather_task");
                }
                if (this.f303036B.isChecked()) {
                    arrayList.add("show_commute_task");
                }
                if (this.f303038D.isChecked()) {
                    arrayList.add("show_meetings_task");
                }
                if (this.f303037C.isChecked()) {
                    arrayList.add("play_news_task");
                }
                Uri build = Uri.parse(this.f303040e.mo79758x(C90053de.f248962ab)).buildUpon().appendQueryParameter("selected_tasks", TextUtils.join(",", arrayList)).appendQueryParameter("lock_screen_permission_granted", Boolean.toString(mo97342k())).appendQueryParameter("hl", Locale.getDefault().toLanguageTag()).build();
                C58976aa aaVar = C58975e.f156826a;
                C89019aq c = C89020ar.m144758c();
                c.mo82994f(build.toString());
                c.f241245k = 9;
                C89020ar a = c.mo82989a();
                this.f303041f.mo28211k(this.f303042g.mo80852a(this.f303056u.mo78026b("WakeUpRoutineFragment", C118575h.GRAPH_NETWORK_REQUEST, C118575h.ACTIVITY_OPA), C89066v.f241382a, new C89018ap(a, C89009ag.f241207b)), "WakeUpRoutineFragment fetchRoutineDataFuture", new C108977fz(this));
            } catch (MalformedURLException e) {
                C59104x c2 = f303029b.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "WakeUpRoutineFragment");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(24479)).mo56386p("Failed to fetch Routine data");
                mo77318iT().mo77312a();
            }
        } else {
            mo77318iT().mo77312a();
        }
    }

    /* renamed from: h */
    public final void mo97339h() {
        Button a = this.f303058z.f228726a.mo77360a();
        if (m181249m()) {
            if (!a.isEnabled()) {
                C58976aa aaVar = C58975e.f156826a;
                a.setEnabled(true);
            }
        } else if (a.isEnabled()) {
            C58976aa aaVar2 = C58975e.f156826a;
            a.setEnabled(false);
        }
    }

    /* renamed from: i */
    public final void mo97340i() {
        ArrayList arrayList = new ArrayList();
        String[] shortWeekdays = this.f303057y.getShortWeekdays();
        ArrayList e = mo97337e();
        int size = e.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(shortWeekdays[((Integer) e.get(i)).intValue()]);
        }
        if (arrayList.isEmpty()) {
            this.f303050o.setText(m181248l());
            return;
        }
        String string = ((C73841bf) this.f303043h.mo27525b()).mo65322a().getString(R.string.opa_wakeup_routine_screen_time_picker_contact_word);
        String l = m181248l();
        String join = TextUtils.join(", ", arrayList);
        this.f303050o.setText(l + " " + string + " " + join);
    }

    /* renamed from: j */
    public final void mo97341j() {
        this.f303039E.setText(m181248l());
    }

    /* renamed from: k */
    public final boolean mo97342k() {
        if (!this.f303040e.mo79746e(C90053de.f248965ae)) {
            return false;
        }
        if (this.f303038D.getVisibility() == 0 && this.f303038D.isChecked()) {
            return true;
        }
        if (this.f303036B.getVisibility() != 0 || !this.f303036B.isChecked()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r18, android.view.ViewGroup r19, android.os.Bundle r20) {
        /*
            r17 = this;
            r0 = r17
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r1 = r0.f303055t
            android.content.Context r2 = r18.getContext()
            boolean r3 = r0.f303046k
            android.content.Context r1 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84027v.m133919a(r1, r2, r3)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            android.content.Context r1 = r1.getContext()
            r0.f303053r = r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = new com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout
            android.content.Context r2 = r0.f303053r
            r1.<init>(r2)
            r0.f303058z = r1
            com.google.android.libraries.logging.j r2 = new com.google.android.libraries.logging.j
            r3 = 101463(0x18c57, float:1.4218E-40)
            r2.<init>(r3)
            com.google.android.libraries.logging.C28295m.m52919e(r1, r2)
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r2 = 2131627228(0x7f0e0cdc, float:1.8881715E38)
            r1.mo77370b(r2)
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r2 = 2131434071(0x7f0b1a57, float:1.8489946E38)
            android.view.View r1 = r1.findViewById(r2)
            com.google.android.apps.gsa.opaonboarding.ui.HeaderLayout r1 = (com.google.android.apps.gsa.opaonboarding.p6463ui.HeaderLayout) r1
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303040e
            com.google.android.apps.gsa.shared.m.d r3 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248968ah
            boolean r2 = r2.mo79746e(r3)
            java.lang.String r3 = "play_news_task"
            java.lang.String r4 = "show_weather_task"
            r5 = 2
            if (r2 == 0) goto L_0x006b
            android.widget.TextView r2 = r1.f228718a
            r6 = 2132090839(0x7f151fd7, float:1.982203E38)
            java.lang.CharSequence r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r6, r1)
            android.widget.TextView$BufferType r7 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r6, r7, r1)
            android.widget.TextView r2 = r1.f228719b
            r6 = 2132090834(0x7f151fd2, float:1.982202E38)
            java.lang.CharSequence r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r6, r1)
            android.widget.TextView$BufferType r7 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r6, r7, r1)
            goto L_0x00b0
        L_0x006b:
            android.widget.TextView r2 = r1.f228718a
            r6 = 2132090838(0x7f151fd6, float:1.9822027E38)
            java.lang.CharSequence r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r6, r1)
            android.widget.TextView$BufferType r7 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r6, r7, r1)
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303040e
            com.google.android.apps.gsa.shared.m.h r6 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248958Y
            com.google.common.b.gu r2 = r2.mo79745c(r6)
            int r6 = r2.size()
            if (r6 != r5) goto L_0x00a2
            boolean r6 = r2.contains(r4)
            if (r6 == 0) goto L_0x00a2
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L_0x00a2
            android.widget.TextView r2 = r1.f228719b
            r6 = 2132090833(0x7f151fd1, float:1.9822017E38)
            java.lang.CharSequence r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r6, r1)
            android.widget.TextView$BufferType r7 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r6, r7, r1)
            goto L_0x00b0
        L_0x00a2:
            android.widget.TextView r2 = r1.f228719b
            r6 = 2132090832(0x7f151fd0, float:1.9822015E38)
            java.lang.CharSequence r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133906a(r6, r1)
            android.widget.TextView$BufferType r7 = android.widget.TextView.BufferType.NORMAL
            com.google.android.apps.gsa.opaonboarding.p6463ui.C84018m.m133908c(r2, r6, r7, r1)
        L_0x00b0:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303040e
            com.google.android.apps.gsa.shared.m.d r2 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248966af
            boolean r1 = r1.mo79746e(r2)
            r2 = 0
            if (r1 == 0) goto L_0x00df
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303040e
            com.google.android.apps.gsa.shared.m.d r6 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248968ah
            boolean r1 = r1.mo79746e(r6)
            r6 = 2131437028(0x7f0b25e4, float:1.8495943E38)
            if (r1 == 0) goto L_0x00d6
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            android.view.View r1 = r1.findViewById(r6)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r7 = 2131235750(0x7f0813a6, float:1.8087703E38)
            r1.setImageResource(r7)
        L_0x00d6:
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            android.view.View r1 = r1.findViewById(r6)
            r1.setVisibility(r2)
        L_0x00df:
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            com.google.android.apps.gsa.opaonboarding.ui.g r1 = r1.mo77369a()
            r1.mo77475d(r5)
            com.google.android.apps.gsa.opaonboarding.ui.e r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f.m133882e()
            r7 = 2132090821(0x7f151fc5, float:1.9821993E38)
            java.lang.CharSequence r7 = r0.getText(r7)
            r6.mo77375c(r7)
            com.google.android.apps.gsa.staticplugins.opa.errorui.fs r7 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fs
            r7.<init>(r0)
            com.google.android.apps.gsa.shared.logger.l r8 = new com.google.android.apps.gsa.shared.logger.l
            r8.<init>(r7)
            r7 = r6
            com.google.android.apps.gsa.opaonboarding.ui.a r7 = (com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a) r7
            r7.f228734b = r8
            com.google.android.apps.gsa.opaonboarding.ui.f r6 = r6.mo77373a()
            r1.mo77472a(r6)
            com.google.android.apps.gsa.opaonboarding.ui.e r6 = com.google.android.apps.gsa.opaonboarding.p6463ui.C84011f.m133882e()
            r7 = 2132090827(0x7f151fcb, float:1.9822005E38)
            java.lang.CharSequence r7 = r0.getText(r7)
            r6.mo77375c(r7)
            com.google.android.apps.gsa.staticplugins.opa.errorui.ft r7 = new com.google.android.apps.gsa.staticplugins.opa.errorui.ft
            r7.<init>(r0)
            com.google.android.apps.gsa.shared.logger.l r8 = new com.google.android.apps.gsa.shared.logger.l
            r8.<init>(r7)
            r7 = r6
            com.google.android.apps.gsa.opaonboarding.ui.a r7 = (com.google.android.apps.gsa.opaonboarding.p6463ui.C83958a) r7
            r7.f228734b = r8
            com.google.android.apps.gsa.opaonboarding.ui.f r6 = r6.mo77373a()
            r1.mo77473b(r6)
            java.util.Calendar r1 = r0.f303047l
            r6 = 11
            r7 = 7
            r1.set(r6, r7)
            java.util.Calendar r1 = r0.f303047l
            r6 = 12
            r1.set(r6, r2)
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437038(0x7f0b25ee, float:1.8495963E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f303049n = r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437029(0x7f0b25e5, float:1.8495945E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f303039E = r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437030(0x7f0b25e6, float:1.8495947E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0.f303050o = r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437031(0x7f0b25e7, float:1.849595E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r0.f303051p = r1
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.f303052q = r1
            android.widget.LinearLayout r1 = r0.f303051p
            r6 = 8
            r1.setVisibility(r6)
            r17.mo97340i()
            android.widget.TextView r1 = r0.f303049n
            com.google.android.apps.gsa.staticplugins.opa.errorui.fu r6 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fu
            r6.<init>(r0)
            r1.setOnClickListener(r6)
            boolean r1 = r0.f303045j
            if (r1 != 0) goto L_0x019f
            com.google.android.apps.gsa.staticplugins.nga.ui.b.a r1 = r0.f303055t
            boolean r1 = r1.mo93971b()
            if (r1 == 0) goto L_0x019a
            goto L_0x019f
        L_0x019a:
            android.content.Context r1 = r0.f303053r
            r0.f303054s = r1
            goto L_0x01ab
        L_0x019f:
            androidx.a.a.b r1 = new androidx.a.a.b
            android.content.Context r6 = r0.f303053r
            r7 = 16974126(0x103012e, float:2.4061746E-38)
            r1.<init>((android.content.Context) r6, (int) r7)
            r0.f303054s = r1
        L_0x01ab:
            android.widget.TextView r1 = r0.f303039E
            com.google.android.apps.gsa.staticplugins.opa.errorui.fy r6 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fy
            r6.<init>(r0)
            r1.setOnClickListener(r6)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.lang.String r6 = "EEEEE"
            java.util.Locale r7 = java.util.Locale.getDefault()
            r1.<init>(r6, r7)
            com.google.common.b.hd r6 = f303034x
            com.google.common.b.ij r6 = r6.entrySet()
            com.google.common.b.sl r6 = r6.iterator()
        L_0x01ca:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x020e
            java.lang.Object r7 = r6.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r8 = r0.f303058z
            java.lang.Object r9 = r7.getKey()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            android.view.View r8 = r8.findViewById(r9)
            android.widget.ToggleButton r8 = (android.widget.ToggleButton) r8
            java.util.GregorianCalendar r9 = new java.util.GregorianCalendar
            java.lang.Object r7 = r7.getValue()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r7 = r7 + 19
            r10 = 2014(0x7de, float:2.822E-42)
            r11 = 6
            r9.<init>(r10, r11, r7)
            java.util.Date r7 = r9.getTime()
            java.lang.String r7 = r1.format(r7)
            r8.setText(r7)
            r8.setTextOn(r7)
            r8.setTextOff(r7)
            goto L_0x01ca
        L_0x020e:
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437017(0x7f0b25d9, float:1.849592E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.f303035A = r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437012(0x7f0b25d4, float:1.849591E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.f303038D = r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437013(0x7f0b25d5, float:1.8495913E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.f303036B = r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437015(0x7f0b25d7, float:1.8495917E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r0.f303037C = r1
            android.widget.CheckBox r1 = r0.f303035A
            com.google.android.apps.gsa.staticplugins.opa.errorui.fl r6 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fl
            r6.<init>(r0)
            r1.setOnClickListener(r6)
            android.widget.CheckBox r1 = r0.f303038D
            com.google.android.apps.gsa.staticplugins.opa.errorui.fm r6 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fm
            r6.<init>(r0)
            r1.setOnClickListener(r6)
            android.widget.CheckBox r1 = r0.f303036B
            com.google.android.apps.gsa.staticplugins.opa.errorui.fn r6 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fn
            r6.<init>(r0)
            r1.setOnClickListener(r6)
            android.widget.CheckBox r1 = r0.f303037C
            com.google.android.apps.gsa.staticplugins.opa.errorui.fo r6 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fo
            r6.<init>(r0)
            r1.setOnClickListener(r6)
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r6 = 2131437014(0x7f0b25d6, float:1.8495915E38)
            android.view.View r1 = r1.findViewById(r6)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r6 = r0.f303058z
            r7 = 2131437016(0x7f0b25d8, float:1.8495919E38)
            android.view.View r6 = r6.findViewById(r7)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r7 = r0.f303058z
            r8 = 2131437019(0x7f0b25db, float:1.8495925E38)
            android.view.View r7 = r7.findViewById(r8)
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r8 = r0.f303058z
            r9 = 2131437021(0x7f0b25dd, float:1.8495929E38)
            android.view.View r8 = r8.findViewById(r9)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            com.google.android.apps.gsa.search.core.i.t r9 = r0.f303040e
            com.google.android.apps.gsa.shared.m.h r10 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248958Y
            com.google.common.b.gu r9 = r9.mo79745c(r10)
            int r10 = r9.size()
            r11 = 0
        L_0x02a3:
            java.lang.String r12 = "show_commute_task"
            java.lang.String r13 = "show_meetings_task"
            r15 = 3
            r14 = 1
            if (r11 >= r10) goto L_0x038d
            java.lang.Object r16 = r9.get(r11)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            int r16 = r2.hashCode()
            switch(r16) {
                case 43703818: goto L_0x02d3;
                case 666350988: goto L_0x02cb;
                case 1096392946: goto L_0x02c3;
                case 1944732710: goto L_0x02bb;
                default: goto L_0x02ba;
            }
        L_0x02ba:
            goto L_0x02db
        L_0x02bb:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x02db
            r2 = 3
            goto L_0x02dc
        L_0x02c3:
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x02db
            r2 = 0
            goto L_0x02dc
        L_0x02cb:
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x02db
            r2 = 2
            goto L_0x02dc
        L_0x02d3:
            boolean r2 = r2.equals(r13)
            if (r2 == 0) goto L_0x02db
            r2 = 1
            goto L_0x02dc
        L_0x02db:
            r2 = -1
        L_0x02dc:
            r12 = 5
            if (r2 == 0) goto L_0x036a
            if (r2 == r14) goto L_0x034b
            if (r2 == r5) goto L_0x0319
            if (r2 == r15) goto L_0x02e7
            goto L_0x0388
        L_0x02e7:
            android.widget.CheckBox r2 = r0.f303037C
            r13 = 2132090824(0x7f151fc8, float:1.9821999E38)
            r2.setText(r13)
            r2 = 0
            r6.setVisibility(r2)
            android.widget.CheckBox r13 = r0.f303037C
            com.google.android.libraries.logging.j r14 = new com.google.android.libraries.logging.j
            r15 = 101467(0x18c5b, float:1.42186E-40)
            r14.<init>(r15)
            r14.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r13, r14)
            com.google.android.apps.gsa.search.core.i.t r12 = r0.f303040e
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248964ad
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0388
            r8.setVisibility(r2)
            com.google.android.apps.gsa.staticplugins.opa.errorui.fq r12 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fq
            r12.<init>(r0)
            r8.setOnClickListener(r12)
            goto L_0x0388
        L_0x0319:
            r2 = 0
            android.widget.CheckBox r13 = r0.f303036B
            r14 = 2132090823(0x7f151fc7, float:1.9821997E38)
            r13.setText(r14)
            r1.setVisibility(r2)
            android.widget.CheckBox r13 = r0.f303036B
            com.google.android.libraries.logging.j r14 = new com.google.android.libraries.logging.j
            r15 = 101466(0x18c5a, float:1.42184E-40)
            r14.<init>(r15)
            r14.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r13, r14)
            com.google.android.apps.gsa.search.core.i.t r12 = r0.f303040e
            com.google.android.apps.gsa.shared.m.d r13 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248963ac
            boolean r12 = r12.mo79746e(r13)
            if (r12 == 0) goto L_0x0388
            r7.setVisibility(r2)
            com.google.android.apps.gsa.staticplugins.opa.errorui.fp r12 = new com.google.android.apps.gsa.staticplugins.opa.errorui.fp
            r12.<init>(r0)
            r7.setOnClickListener(r12)
            goto L_0x0388
        L_0x034b:
            r2 = 0
            android.widget.CheckBox r13 = r0.f303038D
            r14 = 2132090822(0x7f151fc6, float:1.9821995E38)
            r13.setText(r14)
            android.widget.CheckBox r13 = r0.f303038D
            r13.setVisibility(r2)
            android.widget.CheckBox r2 = r0.f303038D
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j
            r14 = 101465(0x18c59, float:1.42183E-40)
            r13.<init>(r14)
            r13.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r13)
            goto L_0x0388
        L_0x036a:
            android.widget.CheckBox r2 = r0.f303035A
            r13 = 2132090826(0x7f151fca, float:1.9822003E38)
            r2.setText(r13)
            android.widget.CheckBox r2 = r0.f303035A
            r13 = 0
            r2.setVisibility(r13)
            android.widget.CheckBox r2 = r0.f303035A
            com.google.android.libraries.logging.j r13 = new com.google.android.libraries.logging.j
            r14 = 101464(0x18c58, float:1.42181E-40)
            r13.<init>(r14)
            r13.mo33795i(r12)
            com.google.android.libraries.logging.C28295m.m52919e(r2, r13)
        L_0x0388:
            int r11 = r11 + 1
            r2 = 0
            goto L_0x02a3
        L_0x038d:
            com.google.android.apps.gsa.search.core.i.t r1 = r0.f303040e
            com.google.android.apps.gsa.shared.m.h r2 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248957X
            com.google.common.b.gu r1 = r1.mo79745c(r2)
            int r2 = r1.size()
            r6 = 0
        L_0x039a:
            if (r6 >= r2) goto L_0x040e
            java.lang.Object r7 = r1.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            int r8 = r7.hashCode()
            switch(r8) {
                case 43703818: goto L_0x03c2;
                case 666350988: goto L_0x03ba;
                case 1096392946: goto L_0x03b2;
                case 1944732710: goto L_0x03aa;
                default: goto L_0x03a9;
            }
        L_0x03a9:
            goto L_0x03ca
        L_0x03aa:
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L_0x03ca
            r7 = 3
            goto L_0x03cb
        L_0x03b2:
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x03ca
            r7 = 0
            goto L_0x03cb
        L_0x03ba:
            boolean r7 = r7.equals(r12)
            if (r7 == 0) goto L_0x03ca
            r7 = 2
            goto L_0x03cb
        L_0x03c2:
            boolean r7 = r7.equals(r13)
            if (r7 == 0) goto L_0x03ca
            r7 = 1
            goto L_0x03cb
        L_0x03ca:
            r7 = -1
        L_0x03cb:
            if (r7 == 0) goto L_0x03fe
            if (r7 == r14) goto L_0x03f0
            if (r7 == r5) goto L_0x03e2
            if (r7 == r15) goto L_0x03d4
            goto L_0x040b
        L_0x03d4:
            android.widget.CheckBox r7 = r0.f303037C
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x040b
            android.widget.CheckBox r7 = r0.f303037C
            r7.setChecked(r14)
            goto L_0x040b
        L_0x03e2:
            android.widget.CheckBox r7 = r0.f303036B
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x040b
            android.widget.CheckBox r7 = r0.f303036B
            r7.setChecked(r14)
            goto L_0x040b
        L_0x03f0:
            android.widget.CheckBox r7 = r0.f303038D
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x040b
            android.widget.CheckBox r7 = r0.f303038D
            r7.setChecked(r14)
            goto L_0x040b
        L_0x03fe:
            android.widget.CheckBox r7 = r0.f303035A
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L_0x040b
            android.widget.CheckBox r7 = r0.f303035A
            r7.setChecked(r14)
        L_0x040b:
            int r6 = r6 + 1
            goto L_0x039a
        L_0x040e:
            r17.mo97339h()
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            r2 = 2131437027(0x7f0b25e3, float:1.8495941E38)
            android.view.View r1 = r1.findViewById(r2)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.google.android.apps.gsa.search.core.i.t r2 = r0.f303040e
            com.google.android.apps.gsa.shared.m.h r3 = com.google.android.apps.gsa.shared.p7066m.C90053de.f248959Z
            java.lang.String r2 = r2.mo79758x(r3)
            android.net.Uri r2 = android.net.Uri.parse(r2)
            dagger.a r3 = r0.f303043h
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bf r3 = (com.google.android.apps.gsa.assistant.shared.C73841bf) r3
            android.content.res.Resources r3 = r3.mo65322a()
            r4 = 2132090830(0x7f151fce, float:1.9822011E38)
            java.lang.String r3 = r3.getString(r4)
            dagger.a r4 = r0.f303043h
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.apps.gsa.assistant.shared.bf r4 = (com.google.android.apps.gsa.assistant.shared.C73841bf) r4
            android.content.res.Resources r4 = r4.mo65322a()
            java.lang.Object[] r5 = new java.lang.Object[r14]
            r6 = 0
            r5[r6] = r3
            r6 = 2132090831(0x7f151fcf, float:1.9822013E38)
            java.lang.String r4 = r4.getString(r6, r5)
            android.text.SpannableString r5 = new android.text.SpannableString
            r5.<init>(r4)
            java.lang.String r4 = r5.toString()
            int r4 = r4.indexOf(r3)
            int r3 = r3.length()
            com.google.android.apps.gsa.staticplugins.opa.errorui.ga r6 = new com.google.android.apps.gsa.staticplugins.opa.errorui.ga
            android.content.Context r7 = r0.f303053r
            r6.<init>(r0, r7, r2)
            int r3 = r3 + r4
            r2 = 33
            r5.setSpan(r6, r4, r3, r2)
            r1.setText(r5)
            android.text.method.MovementMethod r2 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r2)
            com.google.android.apps.gsa.opaonboarding.ui.OpaPageLayout r1 = r0.f303058z
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.errorui.C108980gb.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }
}
