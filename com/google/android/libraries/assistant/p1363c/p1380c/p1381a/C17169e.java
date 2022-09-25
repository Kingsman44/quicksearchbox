package com.google.android.libraries.assistant.p1363c.p1380c.p1381a;

import android.content.Context;
import com.google.common.base.C58817ah;
import java.io.IOException;
import org.p5610a.p5611a.p5612a.C71989i;

/* renamed from: com.google.android.libraries.assistant.c.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C17169e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ Context f49878a;

    public /* synthetic */ C17169e(Context context) {
        this.f49878a = context;
    }

    public final Object apply(Object obj) {
        Void voidR = (Void) obj;
        try {
            return C71989i.m105288c(this.f49878a.getAssets().open("endpointer.data"));
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
