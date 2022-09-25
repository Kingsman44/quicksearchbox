package com.google.android.libraries.search.assistant.performer.p2754f;

import com.google.android.libraries.search.assistant.performer.p2728a.C35471g;
import com.google.android.libraries.search.assistant.performer.p2728a.C35472h;
import com.google.android.libraries.search.assistant.performer.p2754f.p2755a.C36000a;
import com.google.assistant.p3897e.p3921j.C51809dy;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.assistant.performer.f.a */
/* compiled from: PG */
public final class C35999a implements C35472h {

    /* renamed from: a */
    private final C36000a f94200a;

    public C35999a(C36000a aVar) {
        this.f94200a = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo20766a(C51809dy dyVar) {
        if (dyVar.f135936b.equals("ui.SHOW_INTENT_PLATE")) {
            return this.f94200a.mo39926a(dyVar);
        }
        throw new C35471g(String.format("ClientOp name is incorrect. Expected %1$s but instead got %2$s", new Object[]{"ui.SHOW_INTENT_PLATE", dyVar.f135936b}));
    }
}
