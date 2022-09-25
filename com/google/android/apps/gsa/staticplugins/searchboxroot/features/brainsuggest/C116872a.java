package com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest;

import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.android.libraries.searchbox.root.RootSuggestion;
import com.google.android.libraries.searchbox.shared.p3201b.C41642a;
import com.google.android.libraries.searchbox.shared.suggestion.C41669ai;
import com.google.android.libraries.searchbox.shared.suggestion.C41679e;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4017at.p4060h.p4073d.p4074a.C54227ap;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54257u;
import com.google.p4017at.p4060h.p4073d.p4074a.C54258v;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.brainsuggest.a */
/* compiled from: PG */
final class C116872a extends C90880an {

    /* renamed from: a */
    final /* synthetic */ C41642a f324358a;

    /* renamed from: b */
    final /* synthetic */ BrainSuggestDecoder f324359b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C116872a(BrainSuggestDecoder brainSuggestDecoder, C41642a aVar) {
        super("sb.v.u.BrainDecoder", "fetchingBrainSuggestions", 0);
        this.f324359b = brainSuggestDecoder;
        this.f324358a = aVar;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String[] brainSuggestions = this.f324359b.getBrainSuggestions(((C88616t) this.f324358a).f239556a.mo84352bk(), this.f324359b.f324356c, 5);
        String bk = ((C88616t) this.f324358a).f239556a.mo84352bk();
        int length = bk.length();
        do {
            length--;
            if (length < 0 || Character.isWhitespace(bk.charAt(length))) {
                int i = length + 1;
                C58480gp gpVar = new C58480gp(4);
                int i2 = 0;
            }
            length--;
            break;
        } while (Character.isWhitespace(bk.charAt(length)));
        int i3 = length + 1;
        C58480gp gpVar2 = new C58480gp(4);
        int i22 = 0;
        while (true) {
            int length2 = brainSuggestions.length;
            if (i22 >= length2) {
                return new C41626a(gpVar2.mo55394f());
            }
            if (brainSuggestions[i22].length() > bk.length()) {
                C54257u uVar = (C54257u) C54258v.f142462c.createBuilder();
                String substring = brainSuggestions[i22].substring(i3);
                uVar.copyOnWrite();
                C54258v vVar = (C54258v) uVar.instance;
                substring.getClass();
                vVar.f142464a |= 2;
                vVar.f142465b = substring;
                C54258v vVar2 = (C54258v) uVar.build();
                C54227ap apVar = (C54227ap) C54228aq.f142328w.createBuilder();
                apVar.copyOnWrite();
                C54228aq aqVar = (C54228aq) apVar.instance;
                vVar2.getClass();
                aqVar.f142339k = vVar2;
                aqVar.f142330a |= 128;
                gpVar2.mo55395g(new RootSuggestion(brainSuggestions[i22], 13, 33, C58485gu.m89846n(168), brainSuggestions[i22].toLowerCase(Locale.US), C41669ai.f108954c, length2 - i22, (C54228aq) apVar.build(), C41679e.f109005p));
            }
            i22++;
        }
    }
}
