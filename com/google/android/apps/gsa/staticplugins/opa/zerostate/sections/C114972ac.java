package com.google.android.apps.gsa.staticplugins.opa.zerostate.sections;

import android.app.AlarmManager;
import android.content.Intent;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114751e;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8634h.C114752f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114802az;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114877i;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.assistant.p3897e.p3921j.C52282lz;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3994s.p3995a.C53350kq;
import com.google.assistant.p3994s.p3995a.C53354ku;
import com.google.assistant.p3994s.p3995a.C53366lf;
import com.google.assistant.p3994s.p3995a.C53420nf;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.p5633c.p5634a.C72132a;
import org.p5633c.p5634a.C72210d;
import org.p5633c.p5634a.C72288l;
import org.p5633c.p5634a.C72289m;
import org.p5633c.p5634a.C72298v;
import org.p5633c.p5634a.p5636b.C72156ab;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.sections.ac */
/* compiled from: PG */
public final /* synthetic */ class C114972ac implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ C114976ag f319082a;

    public /* synthetic */ C114972ac(C114976ag agVar) {
        this.f319082a = agVar;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        C53420nf nfVar;
        C52395qd qdVar;
        C114976ag agVar = this.f319082a;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(agVar.f319092c).inflate(R.layout.ambient_summary_view, (ViewGroup) null);
        TextView textView = (TextView) viewGroup.findViewById(R.id.ambient_summary_update_text);
        C28292j jVar = new C28292j(75925);
        jVar.mo33795i(5);
        textView.getClass();
        C28295m.m52919e(textView, jVar);
        agVar.f319101l.add(C28293k.m52908e(jVar, new C28293k[0]));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        C114752f fVar = C114752f.UNKNOWN;
        int ordinal = agVar.f319093d.f318710a.ordinal();
        int i = 4;
        if (ordinal == 1) {
            spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_morning_greeting));
        } else if (ordinal == 2) {
            spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_afternoon_greeting));
        } else if (ordinal == 3) {
            spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_evening_greeting));
        } else if (ordinal == 4) {
            spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_night_greeting));
        }
        if (!spannableStringBuilder.toString().isEmpty()) {
            spannableStringBuilder.append(" ");
        }
        if (agVar.f319095f.mo101774a().mo56113h()) {
            C58485gu d = ((C115017bu) agVar.f319095f.mo101774a().mo56107c()).mo101819d();
            int size = d.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                C53366lf a = ((C114751e) d.get(i2)).mo101573a();
                if (a.f140037b == i) {
                    nfVar = (C53420nf) a.f140038c;
                } else {
                    nfVar = C53420nf.f140165o;
                }
                if (nfVar.f140168b == 3) {
                    C58833ax c = C114874f.m190403c(((C53350kq) nfVar.f140169c).f139994b, true);
                    if (!c.mo56113h()) {
                        continue;
                    } else {
                        C52282lz lzVar = ((C53354ku) c.mo56107c()).f140002b;
                        if (lzVar == null) {
                            lzVar = C52282lz.f137236h;
                        }
                        if ((lzVar.f137238a & 2) != 0) {
                            qdVar = lzVar.f137240c;
                            if (qdVar == null) {
                                qdVar = C52395qd.f137485e;
                            }
                        } else {
                            qdVar = null;
                        }
                        C58833ax b = C114802az.m190315b(qdVar);
                        if (b.mo56113h()) {
                            String string = agVar.f319091b.getResources().getString(R.string.ambient_next_event);
                            spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_agenda_summary, new Object[]{string, C114874f.m190405e(agVar.f319091b, (C72210d) b.mo56107c(), true, false)}));
                            C58833ax b2 = C114874f.m190402b((C53354ku) c.mo56107c());
                            if (b2.mo56113h()) {
                                agVar.mo101772h(spannableStringBuilder, string, new C114973ad(agVar.f319096g, (Intent) b2.mo56107c()), true, (Integer) null);
                            }
                        }
                    }
                }
                i2++;
                i = 4;
            }
            C59104x b3 = C114976ag.f319090a.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "AmbientSummarySC");
            ((C59052c) ((C59052c) b3).mo56372aa(29472)).mo56386p("Summary message appended.");
            textView.setText(spannableStringBuilder);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            C28292j jVar2 = new C28292j(78293);
            agVar.f319102m = C28293k.m52907d(jVar2, agVar.f319101l);
            viewGroup.getClass();
            C28295m.m52919e(viewGroup, jVar2);
            return viewGroup;
        }
        if (!agVar.mo101773k(spannableStringBuilder)) {
            long b4 = agVar.f319094e.mo26870b();
            if (!C114877i.m190422a(b4)) {
                if (agVar.f319103n) {
                    int ordinal2 = agVar.f319093d.f318710a.ordinal();
                    if (ordinal2 == 1) {
                        spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_morning_no_update_summary));
                    } else if (ordinal2 == 2) {
                        spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_afternoon_no_update_summary));
                    } else if (ordinal2 == 3) {
                        spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_evening_no_update_summary));
                    }
                }
                textView.setText(spannableStringBuilder);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                C28292j jVar22 = new C28292j(78293);
                agVar.f319102m = C28293k.m52907d(jVar22, agVar.f319101l);
                viewGroup.getClass();
                C28295m.m52919e(viewGroup, jVar22);
                return viewGroup;
            }
            AlarmManager.AlarmClockInfo nextAlarmClock = ((AlarmManager) agVar.f319099j.mo27525b()).getNextAlarmClock();
            if (nextAlarmClock == null || nextAlarmClock.getTriggerTime() - b4 > TimeUnit.DAYS.toMillis(1)) {
                String string2 = agVar.f319091b.getResources().getString(R.string.ambient_no_alarm);
                String string3 = agVar.f319091b.getResources().getString(R.string.ambient_set_alarm);
                spannableStringBuilder.append(agVar.f319091b.getResources().getString(R.string.ambient_no_alarm_summary, new Object[]{string2}));
                agVar.mo101772h(spannableStringBuilder, string2, new C114971ab(agVar, string3), false, (Integer) null);
            } else {
                String string4 = agVar.f319091b.getResources().getString(R.string.ambient_alarm);
                spannableStringBuilder.append(agVar.f319091b.getResources().getString(true != C72289m.m106807c(new C72298v(b4, (C72132a) C72156ab.m105789X(C72288l.m106788o(TimeZone.getDefault()))), new C72298v(nextAlarmClock.getTriggerTime(), (C72132a) C72156ab.m105789X(C72288l.m106788o(TimeZone.getDefault())))).equals(C72289m.f192425b) ? R.string.ambient_alarm_summary : R.string.ambient_alarm_tomorrow_summary, new Object[]{string4, C114874f.m190405e(agVar.f319091b, new C72210d(nextAlarmClock.getTriggerTime()), true, false)}));
                if (nextAlarmClock.getShowIntent() != null) {
                    agVar.mo101772h(spannableStringBuilder, string4, new C114974ae(nextAlarmClock.getShowIntent()), true, (Integer) null);
                }
            }
        }
        C59104x b32 = C114976ag.f319090a.mo56224b();
        b32.mo56378ag(C58975e.f156826a, "AmbientSummarySC");
        ((C59052c) ((C59052c) b32).mo56372aa(29472)).mo56386p("Summary message appended.");
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        C28292j jVar222 = new C28292j(78293);
        agVar.f319102m = C28293k.m52907d(jVar222, agVar.f319101l);
        viewGroup.getClass();
        C28295m.m52919e(viewGroup, jVar222);
        return viewGroup;
    }
}
