package com.google.android.apps.gsa.shared.util.p7173k;

import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.common.p4552o.C59795fw;
import com.google.common.p4552o.C59796fx;
import com.google.common.p4552o.C59814gg;
import com.google.common.p4552o.C59817gj;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.util.k.a */
/* compiled from: PG */
public final class C91046a implements C90991b {

    /* renamed from: a */
    private static final Pattern f254291a = Pattern.compile("^\\d*(\\.\\d*){2}");

    /* renamed from: b */
    private static final Pattern f254292b = Pattern.compile("\\.(\\w+)$");

    /* renamed from: c */
    private final C91048c f254293c;

    public C91046a(C91048c cVar) {
        this.f254293c = cVar;
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C59795fw fwVar = fVar.f254236a;
        C91048c cVar = this.f254293c;
        C59814gg ggVar = (C59814gg) C59817gj.f161645e.createBuilder();
        ggVar.copyOnWrite();
        C59817gj gjVar = (C59817gj) ggVar.instance;
        gjVar.f161648b = 2;
        gjVar.f161647a |= 1;
        Matcher matcher = f254291a.matcher(cVar.f254294a.versionName);
        String str = "UNKNOWN";
        String group = matcher.find() ? matcher.group() : str;
        ggVar.copyOnWrite();
        C59817gj gjVar2 = (C59817gj) ggVar.instance;
        group.getClass();
        gjVar2.f161647a |= 2;
        gjVar2.f161649c = group;
        Matcher matcher2 = f254292b.matcher(cVar.f254294a.versionName);
        if (matcher2.find()) {
            str = matcher2.group(1);
            str.getClass();
        }
        String upperCase = str.toUpperCase(Locale.US);
        if (upperCase.equals("X86")) {
            ggVar.copyOnWrite();
            C59817gj gjVar3 = (C59817gj) ggVar.instance;
            gjVar3.f161650d = 2;
            gjVar3.f161647a |= 4;
        } else if (upperCase.equals("ARM")) {
            ggVar.copyOnWrite();
            C59817gj gjVar4 = (C59817gj) ggVar.instance;
            gjVar4.f161650d = 0;
            gjVar4.f161647a |= 4;
        } else if (upperCase.equals("ARM64")) {
            ggVar.copyOnWrite();
            C59817gj gjVar5 = (C59817gj) ggVar.instance;
            gjVar5.f161650d = 1;
            gjVar5.f161647a |= 4;
        } else {
            ggVar.copyOnWrite();
            C59817gj gjVar6 = (C59817gj) ggVar.instance;
            gjVar6.f161650d = 3;
            gjVar6.f161647a |= 4;
        }
        C59817gj gjVar7 = (C59817gj) ggVar.build();
        fwVar.copyOnWrite();
        C59796fx fxVar = (C59796fx) fwVar.instance;
        C59796fx fxVar2 = C59796fx.f161580r;
        gjVar7.getClass();
        fxVar.f161583b = gjVar7;
        fxVar.f161582a |= 1;
    }
}
