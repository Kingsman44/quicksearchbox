package com.google.android.apps.search.transcription.voiceime.standalone.settings;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.SwitchPreference;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p590as.p611d.p612a.C10969b;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10976c;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10984k;
import com.google.android.libraries.p590as.p611d.p613b.p614a.p615a.C10987n;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.contrib.p3708i.p3713d.C47713d;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58758qx;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62971cq;
import com.google.protobuf.contrib.android.ProtoParsers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.google.android.apps.search.transcription.voiceime.standalone.settings.n */
/* compiled from: PG */
public final class C142036n {

    /* renamed from: a */
    public static final C59071e f385371a = C59071e.m91332i("com.google.android.apps.search.transcription.voiceime.standalone.settings.n");

    /* renamed from: b */
    public final C142032j f385372b;

    /* renamed from: c */
    public final C10984k f385373c;

    /* renamed from: d */
    public final C46801dp f385374d;

    /* renamed from: e */
    public final C46439e f385375e;

    /* renamed from: f */
    public final C47713d f385376f;

    /* renamed from: g */
    public final C46792di f385377g = new C46792di() {

        /* renamed from: a */
        final HashMap f385380a = new HashMap();

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C142036n.f385371a.mo56225c()).mo56382g(th)).mo56372aa(42018)).mo56386p("load settings failed.");
            C142036n.this.f385372b.getActivity().finish();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C142036n.this.mo116986c().mo8339F(false);
            C142036n.this.mo116985b().mo8339F(false);
            C142036n.this.mo116984a().mo8339F(false);
        }

        /* renamed from: d */
        public final void mo18078b(C10987n nVar) {
            String str;
            CharSequence[] charSequenceArr;
            if (this.f385380a.isEmpty()) {
                for (C10969b bVar : nVar.f36133c) {
                    this.f385380a.put(bVar.f36097b, bVar.f36096a);
                }
            }
            C10976c cVar = nVar.f36132b;
            if (cVar == null) {
                cVar = C10976c.f36107e;
            }
            boolean z = cVar.f36110b;
            SwitchPreference c = C142036n.this.mo116986c();
            c.mo8391j(z);
            boolean z2 = true;
            c.mo8339F(true);
            C58526ih ihVar = new C58526ih();
            C10976c cVar2 = nVar.f36132b;
            if (cVar2 == null) {
                cVar2 = C10976c.f36107e;
            }
            ihVar.mo55373c(cVar2.f36111c);
            C10976c cVar3 = nVar.f36132b;
            if (cVar3 == null) {
                cVar3 = C10976c.f36107e;
            }
            ihVar.mo55489i(cVar3.f36112d);
            C58528ij F = C58528ij.m90006F(C58758qx.m90646d(ihVar.mo55486f(), this.f385380a.keySet()));
            C62971cq cqVar = nVar.f36133c;
            MultiSelectListPreference b = C142036n.this.mo116985b();
            String[] strArr = new String[cqVar.size()];
            String[] strArr2 = new String[cqVar.size()];
            for (int i = 0; i < cqVar.size(); i++) {
                strArr[i] = ((C10969b) cqVar.get(i)).f36097b;
                strArr2[i] = ((C10969b) cqVar.get(i)).f36096a;
            }
            b.f12712h = strArr;
            b.f12711g = strArr2;
            b.mo8332j(F);
            if (F.isEmpty()) {
                str = C142036n.this.f385372b.getContext().getString(R.string.transcription_prefSummary_default);
            } else {
                MultiSelectListPreference b2 = C142036n.this.mo116985b();
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList = new ArrayList(F);
                Collections.sort(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    String str2 = (String) it.next();
                    CharSequence[] charSequenceArr2 = b2.f12711g;
                    int i2 = -1;
                    if (str2 != null && (charSequenceArr = b2.f12712h) != null) {
                        int length = charSequenceArr.length - 1;
                        while (true) {
                            if (length < 0) {
                                break;
                            } else if (TextUtils.equals(b2.f12712h[length].toString(), str2)) {
                                i2 = length;
                                break;
                            } else {
                                length--;
                            }
                        }
                    }
                    sb.append(charSequenceArr2[i2]);
                    if (it.hasNext()) {
                        sb.append(", ");
                    }
                }
                if (F.size() > 1) {
                    str = C142036n.this.f385372b.getContext().getString(R.string.transcription_prefSummary_languages_multiple, new Object[]{sb.toString()});
                } else {
                    str = C142036n.this.f385372b.getContext().getString(R.string.transcription_prefSummary_languages_single, new Object[]{sb.toString()});
                }
            }
            b.mo8329n(str);
            b.mo8339F(true);
            C10976c cVar4 = nVar.f36132b;
            if (cVar4 == null) {
                cVar4 = C10976c.f36107e;
            }
            String str3 = cVar4.f36111c;
            ListPreference a = C142036n.this.mo116984a();
            if (F.isEmpty()) {
                a.mo8339F(false);
                a.mo8329n(C142036n.this.f385372b.getContext().getString(R.string.transcription_prefSummary_default));
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            C58800sl lA = F.iterator();
            while (lA.hasNext()) {
                String str4 = (String) lA.next();
                arrayList2.add(str4);
                arrayList3.add((String) this.f385380a.get(str4));
            }
            a.f12708h = (CharSequence[]) arrayList2.toArray(new String[0]);
            a.mo8318f((CharSequence[]) arrayList3.toArray(new String[0]));
            a.mo8330o(str3);
            a.mo8329n(C142036n.this.f385372b.getContext().getString(R.string.transcription_prefSummary_language, new Object[]{a.f12707g[a.mo8326j(str3)]}));
            if (F.size() <= 1) {
                z2 = false;
            }
            a.mo8339F(z2);
        }
    };

    /* renamed from: h */
    public final C46440f f385378h = new C46440f() {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C142036n.f385371a.mo56225c()).mo56382g(th)).mo56372aa(42020)).mo56386p("save filter settings failed.");
            C142036n.this.mo116986c().mo8339F(true);
            C142036n.this.mo116986c().mo8391j(!((Boolean) obj).booleanValue());
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Void voidR = (Void) obj2;
            C142036n.this.mo116986c().mo8339F(true);
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            C142036n.this.mo116986c().mo8339F(false);
            C142036n.this.mo116986c().mo8391j(((Boolean) obj).booleanValue());
        }
    };

    /* renamed from: i */
    public final C46440f f385379i = new C46440f() {

        /* renamed from: a */
        boolean f385383a;

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            String str = (String) obj;
            ((C59052c) ((C59052c) ((C59052c) C142036n.f385371a.mo56225c()).mo56382g(th)).mo56372aa(42021)).mo56386p("save language settings failed.");
            C142036n.this.mo116985b().mo8339F(true);
            C142036n.this.mo116984a().mo8339F(this.f385383a);
        }

        /* renamed from: c */
        public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
            C10987n nVar = (C10987n) ((ProtoParsers.ParcelableProto) obj2).mo58938a(C10987n.f36129d, C62921ba.m95368a());
            ((C1420371) C142036n.this.f385377g).mo18078b(nVar);
            if (((String) obj).equals("voice_languages")) {
                C10976c cVar = nVar.f36132b;
                if (cVar == null) {
                    cVar = C10976c.f36107e;
                }
                if (cVar.f36112d.size() > 0) {
                    C142036n nVar2 = C142036n.this;
                    nVar2.f385372b.f12807b.mo8434g(nVar2.mo116984a());
                }
            }
        }

        /* renamed from: i */
        public final /* bridge */ /* synthetic */ void mo18068i(Object obj) {
            String str = (String) obj;
            this.f385383a = C142036n.this.mo116984a().mo8354U();
            C142036n.this.mo116985b().mo8339F(false);
            C142036n.this.mo116984a().mo8339F(false);
        }
    };

    public C142036n(C142032j jVar, C10984k kVar, C46801dp dpVar, C46439e eVar, C47713d dVar) {
        this.f385372b = jVar;
        this.f385373c = kVar;
        this.f385374d = dpVar;
        this.f385375e = eVar;
        this.f385376f = dVar;
    }

    /* renamed from: a */
    public final ListPreference mo116984a() {
        return (ListPreference) this.f385372b.mo8411gg("primary_language");
    }

    /* renamed from: b */
    public final MultiSelectListPreference mo116985b() {
        return (MultiSelectListPreference) this.f385372b.mo8411gg("voice_languages");
    }

    /* renamed from: c */
    public final SwitchPreference mo116986c() {
        return (SwitchPreference) this.f385372b.mo8411gg("profanity_filter");
    }
}
