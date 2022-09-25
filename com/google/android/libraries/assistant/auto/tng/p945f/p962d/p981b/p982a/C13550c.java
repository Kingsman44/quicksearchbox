package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p981b.p982a;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13537m;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13538n;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13539o;
import com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.C13543s;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.b.a.c */
/* compiled from: PG */
public final /* synthetic */ class C13550c implements Function {

    /* renamed from: a */
    public final /* synthetic */ C13556i f41516a;

    public /* synthetic */ C13550c(C13556i iVar) {
        this.f41516a = iVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C13556i iVar = this.f41516a;
        C13537m mVar = (C13537m) ((C13543s) obj).toBuilder();
        C13538n nVar = (C13538n) C13539o.f41487c.createBuilder();
        int integer = iVar.f41527e.getResources().getInteger(R.integer.smart_actions_max_num_items);
        nVar.copyOnWrite();
        ((C13539o) nVar.instance).f41489a = integer;
        int integer2 = iVar.f41527e.getResources().getInteger(R.integer.text_reply_max_length);
        nVar.copyOnWrite();
        ((C13539o) nVar.instance).f41490b = integer2;
        mVar.mo21157b(nVar);
        C13538n nVar2 = (C13538n) C13539o.f41487c.createBuilder();
        int integer3 = iVar.f41527e.getResources().getInteger(R.integer.fallback_smart_actions_max_num_items);
        nVar2.copyOnWrite();
        ((C13539o) nVar2.instance).f41489a = integer3;
        int integer4 = iVar.f41527e.getResources().getInteger(R.integer.fallback_text_reply_max_length);
        nVar2.copyOnWrite();
        ((C13539o) nVar2.instance).f41490b = integer4;
        mVar.mo21157b(nVar2);
        return (C13543s) mVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
