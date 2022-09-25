package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import android.net.Uri;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import java.util.Set;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.g */
/* compiled from: PG */
public final /* synthetic */ class C11183g implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Set f36583a;

    public /* synthetic */ C11183g(Set set) {
        this.f36583a = set;
    }

    public final Object apply(Object obj) {
        Set set = this.f36583a;
        C58833ax axVar = (C58833ax) obj;
        Uri uri = C11185i.f36585a;
        if (axVar.mo56113h() && set.contains(axVar.mo56107c())) {
            return axVar;
        }
        if (set.contains("com.google.android.deskclock")) {
            return C58833ax.m90834k("com.google.android.deskclock");
        }
        return C58833ax.m90834k((String) C58557jl.m90130k(set, (Object) null));
    }
}
