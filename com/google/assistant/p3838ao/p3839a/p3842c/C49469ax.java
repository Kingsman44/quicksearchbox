package com.google.assistant.p3838ao.p3839a.p3842c;

import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3838ao.p3839a.C49692r;
import com.google.assistant.p3838ao.p3839a.p3845e.C49589cs;
import com.google.assistant.p3838ao.p3839a.p3845e.C49591cu;
import com.google.assistant.p3838ao.p3839a.p3849i.C49681l;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.assistant.ao.a.c.ax */
/* compiled from: PG */
public final /* synthetic */ class C49469ax implements Function {

    /* renamed from: a */
    public final /* synthetic */ C49692r f127703a;

    public /* synthetic */ C49469ax(C49692r rVar) {
        this.f127703a = rVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C49589cs csVar = (C49589cs) obj;
        String t = this.f127703a.mo53333t(R.string.nga_suggestion_chip_show_on_maps, csVar.f127962b);
        C49591cu cuVar = csVar.f127963c;
        if (cuVar == null) {
            cuVar = C49591cu.f127964c;
        }
        return C49681l.m85669b(t, t, cuVar.f127967b, Optional.empty());
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
