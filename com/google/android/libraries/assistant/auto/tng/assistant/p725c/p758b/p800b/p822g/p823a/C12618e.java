package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.p823a;

import android.speech.RecognitionListener;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p734b.C12025a;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12428b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p804b.C12434h;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p822g.p824b.p825a.C12622b;
import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.C12867k;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13059e;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.C13060f;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.p4456g.C57981b;
import com.google.p4449cd.p4456g.p4458b.C57987f;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.g.a.e */
/* compiled from: PG */
final class C12618e implements C12434h {

    /* renamed from: a */
    public static final C59071e f39590a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.g.a.e");

    /* renamed from: b */
    public final RecognitionListener f39591b;

    /* renamed from: c */
    public final C12025a f39592c;

    /* renamed from: d */
    public final C57987f f39593d = new C57987f();

    /* renamed from: e */
    public C13059e f39594e = ((C13059e) C13060f.f40536l.createBuilder());

    /* renamed from: f */
    public C2164c f39595f;

    /* renamed from: g */
    public final C12622b f39596g;

    /* renamed from: h */
    private final C60870cx f39597h;

    public C12618e(C12622b bVar, C58833ax axVar, C12025a aVar) {
        this.f39596g = bVar;
        this.f39591b = new C12617d(this, axVar);
        this.f39592c = aVar;
        this.f39597h = C2169h.m6027a(new C12616c(this));
    }

    /* renamed from: a */
    public final C60870cx mo20591a() {
        C12622b bVar = this.f39596g;
        bVar.f39603b.mo116878b(bVar.f39605d);
        return this.f39597h;
    }

    /* renamed from: b */
    public final C60870cx mo20592b() {
        return this.f39597h;
    }

    /* renamed from: c */
    public final C60870cx mo20593c() {
        C12428b bVar = new C12428b();
        bVar.f39296a = C60856cj.m92900i(C12867k.f40128d);
        return C60856cj.m92900i(bVar.mo20602a());
    }

    /* renamed from: d */
    public final C57981b mo20594d() {
        return this.f39593d;
    }
}
