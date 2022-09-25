package com.google.android.apps.gsa.speech.settingsui.language;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.preference.ListPreference;
import android.util.AttributeSet;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.search.core.p6513aj.C84559s;
import com.google.android.apps.gsa.search.core.p6513aj.p6515b.C84540a;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90110fh;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.util.C91035f;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92516b;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.p7311n.C92541i;
import com.google.android.apps.gsa.speech.utils.C92654a;
import com.google.android.apps.gsa.tasks.C118471af;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.C60560uk;
import com.google.common.p4552o.C60561ul;
import com.google.p395al.p408c.p414c.p416b.C8460ac;
import com.google.p395al.p408c.p414c.p416b.C8470am;
import com.google.p395al.p408c.p414c.p416b.C8513w;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Collectors;
import p3186j$.util.stream.Stream;

/* compiled from: PG */
public class LanguagePreference extends ListPreference {

    /* renamed from: a */
    public List f258589a = new ArrayList();

    /* renamed from: b */
    public String f258590b;

    /* renamed from: c */
    public C92646j f258591c;

    /* renamed from: d */
    public C84540a f258592d;

    /* renamed from: e */
    public int f258593e;

    /* renamed from: f */
    final List f258594f = new ArrayList();

    /* renamed from: g */
    public String f258595g;

    /* renamed from: h */
    public C89994f f258596h;

    /* renamed from: i */
    public C68214a f258597i;

    /* renamed from: j */
    public C68214a f258598j;

    /* renamed from: k */
    public C68214a f258599k;

    /* renamed from: l */
    private final List f258600l = new ArrayList();

    /* renamed from: com.google.android.apps.gsa.speech.settingsui.language.LanguagePreference$a */
    /* compiled from: PG */
    public interface C92636a {
        /* renamed from: qu */
        void mo87409qu(LanguagePreference languagePreference);
    }

    public LanguagePreference(Context context) {
        super(context);
        m152586c(context);
    }

    /* renamed from: c */
    private final void m152586c(Context context) {
        ((C92636a) C47266f.m84076a(context, C92636a.class)).mo87409qu(this);
        this.f258592d = new C84540a(this.f258596h.mo83829r());
        this.f258593e = (int) ((C90021c) this.f258598j.mo27525b()).mo79743a(C90120fr.f250780T);
    }

    /* renamed from: a */
    public final void mo87404a(DialogInterface dialogInterface) {
        this.f258589a.remove(this.f258590b);
        List list = this.f258589a;
        String[] strArr = (String[]) list.toArray(new String[list.size()]);
        String str = this.f258590b;
        C8460ac a = C92654a.m152604a(((C92541i) this.f258599k.mo27525b()).mo87316a(), str);
        C8513w a2 = ((C92541i) this.f258599k.mo27525b()).mo87316a();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (C8470am amVar : a2.f29533c) {
            for (C8460ac acVar : amVar.f29409a) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    if (acVar.f29383c.equals(strArr[i])) {
                        arrayList.add(acVar);
                        break;
                    }
                    i++;
                }
            }
        }
        C8460ac[] acVarArr = (C8460ac[]) arrayList.toArray(new C8460ac[0]);
        if (!(a == null || acVarArr == null)) {
            C89949q.m146523g(66);
            setValue(str);
        }
        dialogInterface.dismiss();
    }

    /* renamed from: b */
    public final void mo87405b(String str, String str2) {
        Context context = getContext();
        Toast.makeText(getContext(), context.getString(R.string.spoken_language_selected, new Object[]{C91035f.m148707c(str, str2, context.getResources().getConfiguration().locale.toString())}), 0).show();
    }

    /* access modifiers changed from: protected */
    public final void onPrepareDialogBuilder(AlertDialog.Builder builder) {
        C89949q.m146523g(382);
        ArrayList f = C92654a.m152609f(((C92541i) this.f258599k.mo27525b()).mo87316a());
        ArrayList g = C92654a.m152610g(((C92541i) this.f258599k.mo27525b()).mo87316a());
        this.f258594f.clear();
        this.f258600l.clear();
        if (((C90021c) this.f258598j.mo27525b()).mo79746e(C90110fh.f250696bz)) {
            HashSet hashSet = new HashSet();
            hashSet.add(this.f258596h.mo83885ae());
            if (this.f258596h.mo83890aj() != null) {
                hashSet.addAll(this.f258596h.mo83890aj());
            }
            HashMap hashMap = new HashMap();
            for (int i = 0; i < f.size(); i++) {
                hashMap.put((String) f.get(i), (String) g.get(i));
            }
            List list = this.f258594f;
            Stream stream = Collection.EL.stream(f);
            Objects.requireNonNull(hashSet);
            list.addAll((java.util.Collection) stream.filter(new C92637a(hashSet)).collect(Collectors.toList()));
            if (this.f258595g != null) {
                this.f258594f.addAll((java.util.Collection) Collection.EL.stream(f).filter(new C92638b(this)).collect(Collectors.toList()));
            }
            this.f258594f.addAll((java.util.Collection) Collection.EL.stream(f).filter(new C92639c(this)).collect(Collectors.toList()));
            this.f258600l.addAll((java.util.Collection) Collection.EL.stream(this.f258594f).map(new C92640d(hashMap)).collect(Collectors.toList()));
        } else {
            this.f258594f.addAll(f);
            this.f258600l.addAll(g);
        }
        this.f258590b = this.f258596h.mo83885ae();
        List aj = this.f258596h.mo83890aj();
        this.f258589a = aj;
        aj.add(this.f258590b);
        C92645i iVar = new C92645i(this);
        builder.setTitle(R.string.prefDialogTitle_multiLanguage).setMultiChoiceItems((String[]) this.f258600l.toArray(new String[0]), (boolean[]) null, iVar).setPositiveButton(R.string.confirm_language_selection, new C92644h(this, builder.getContext()));
    }

    public final void setValue(String str) {
        C91097g gVar;
        if (this.f258591c != null) {
            ArrayList b = C58597ky.m90211b(this.f258589a);
            b.remove(this.f258590b);
            C92646j jVar = this.f258591c;
            C58976aa aaVar = C58975e.f156826a;
            C92648l lVar = (C92648l) jVar;
            String ae = lVar.f258616b.mo83885ae();
            List aj = lVar.f258616b.mo83890aj();
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 383;
            C60560uk ukVar = (C60560uk) C60561ul.f164283d.createBuilder();
            ukVar.copyOnWrite();
            C60561ul ulVar = (C60561ul) ukVar.instance;
            ae.getClass();
            ulVar.f164285a |= 1;
            ulVar.f164286b = ae;
            ukVar.mo57114a(aj);
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            C60561ul ulVar2 = (C60561ul) ukVar.build();
            ulVar2.getClass();
            ufVar2.f164124ae = ulVar2;
            ufVar2.f164199c |= 256;
            C89994f fVar = lVar.f258616b;
            C8513w a = ((C92541i) lVar.f258623i.mo27525b()).mo87316a();
            boolean z = false;
            if (C92654a.m152612i(a, str)) {
                a.getClass();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        fVar.mo83906az(str, b, str.equals(C92654a.m152607d(Locale.getDefault().toString(), a)));
                        z = true;
                        break;
                    } else if (!C92654a.m152612i(a, (String) b.get(i))) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            lVar.mo87415a(this);
            if (z) {
                if (!ae.equals(str) || !aj.equals(b)) {
                    C60560uk ukVar2 = (C60560uk) C60561ul.f164283d.createBuilder();
                    ukVar2.copyOnWrite();
                    C60561ul ulVar3 = (C60561ul) ukVar2.instance;
                    str.getClass();
                    ulVar3.f164285a |= 1;
                    ulVar3.f164286b = str;
                    ukVar2.mo57114a(b);
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    C60561ul ulVar4 = (C60561ul) ukVar2.build();
                    ulVar4.getClass();
                    ufVar3.f164125af = ulVar4;
                    ufVar3.f164199c |= 512;
                    C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
                }
                if (!ae.equals(str) && !lVar.f258621g.u()) {
                    C92518d dVar = lVar.f258619e;
                    if (dVar != null) {
                        if (!dVar.mo87278f() || (gVar = lVar.f258618d) == null) {
                            lVar.f258619e.mo87275c((C92516b) null);
                        } else {
                            lVar.f258619e.mo87286n(gVar, new C92647k(lVar));
                            C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
                            tzVar2.copyOnWrite();
                            C60555uf ufVar4 = (C60555uf) tzVar2.instance;
                            ufVar4.f164093a |= 2;
                            ufVar4.f164258m = 815;
                            C9439b bVar = C9439b.HOTWORD_RETRAINING_NOTIFICATION_LANGUAGE_CHANGED;
                            tzVar2.copyOnWrite();
                            C60555uf ufVar5 = (C60555uf) tzVar2.instance;
                            ufVar5.f164109aP = bVar.f32835aq;
                            ufVar5.f164251f |= 16;
                            C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
                            if (lVar.f258616b.mo83823l()) {
                                lVar.f258620f.edit().putInt("hands_free_hotword_retraining_notification_source", 14).apply();
                                lVar.f258620f.edit().putInt("hands_free_hotword_retraining_notification_state", 2).apply();
                            }
                        }
                    }
                    String ab = lVar.f258616b.mo83882ab();
                    if (lVar.f258616b.mo83847J(ab)) {
                        C59104x b2 = C92648l.f258615a.mo56224b();
                        b2.mo56378ag(C58975e.f156826a, "LanguageSettingCntl");
                        ((C59052c) ((C59052c) b2).mo56372aa(13016)).mo56386p("Removing speaker ID model : Locale changed");
                        lVar.f258616b.mo83843F(ab, EventForDump.m147676e(3, "LanguageSettingCntl ".concat(String.valueOf(str))));
                    }
                    Context context = lVar.f258617c;
                    context.sendBroadcast(C84559s.m135275a(str, context.getPackageName()));
                }
                C118561t tVar = lVar.f258622h;
                C118522by byVar = C118522by.UPDATE_HOTWORD_MODELS;
                C118471af afVar = (C118471af) C118472ag.f328819i.createBuilder();
                afVar.copyOnWrite();
                C118472ag agVar = (C118472ag) afVar.instance;
                agVar.f328824d = 1;
                agVar.f328821a |= 4;
                tVar.mo103754e(byVar, (C118472ag) afVar.build());
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void showDialog(Bundle bundle) {
        super.showDialog(bundle);
        int i = 0;
        Toast.makeText(getContext(), R.string.multiple_selection_hint, 0).show();
        ListView listView = ((AlertDialog) getDialog()).getListView();
        List list = this.f258594f;
        List list2 = this.f258589a;
        int size = list.size();
        boolean[] zArr = new boolean[size];
        for (int i2 = 0; i2 < size; i2++) {
            zArr[i2] = list2.contains(list.get(i2));
        }
        int i3 = 0;
        while (i < size) {
            listView.setItemChecked(i3, zArr[i]);
            i++;
            i3++;
        }
        listView.setOnItemLongClickListener(new C92641e(this));
    }

    public LanguagePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m152586c(context);
    }
}
