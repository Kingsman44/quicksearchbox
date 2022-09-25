package com.bumptech.glide;

import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1973h;
import com.bumptech.glide.load.data.C5935j;
import com.bumptech.glide.load.p297b.C5768at;
import com.bumptech.glide.load.p299c.p305f.C5917g;
import com.bumptech.glide.p286e.C5549b;
import com.bumptech.glide.p286e.C5550c;
import com.bumptech.glide.p286e.C5551d;
import com.bumptech.glide.p286e.C5552e;
import com.bumptech.glide.p286e.C5554g;
import com.bumptech.glide.p286e.C5556i;
import com.bumptech.glide.p291h.p292a.C5606b;
import com.bumptech.glide.p291h.p292a.C5607c;
import com.bumptech.glide.p291h.p292a.C5609e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bumptech.glide.v */
/* compiled from: PG */
public final class C6003v {

    /* renamed from: a */
    public final C5768at f17680a;

    /* renamed from: b */
    public final C5549b f17681b;

    /* renamed from: c */
    public final C5554g f17682c;

    /* renamed from: d */
    public final C5556i f17683d;

    /* renamed from: e */
    public final C5935j f17684e;

    /* renamed from: f */
    public final C5917g f17685f;

    /* renamed from: g */
    public final C5550c f17686g;

    /* renamed from: h */
    public final C5552e f17687h = new C5552e();

    /* renamed from: i */
    public final C5551d f17688i = new C5551d();

    /* renamed from: j */
    public final C1971f f17689j;

    public C6003v() {
        C5609e eVar = new C5609e(new C1973h(20), new C5606b(), new C5607c());
        this.f17689j = eVar;
        this.f17680a = new C5768at(eVar);
        this.f17681b = new C5549b();
        this.f17682c = new C5554g();
        this.f17683d = new C5556i();
        this.f17684e = new C5935j();
        this.f17685f = new C5917g();
        this.f17686g = new C5550c();
        List<String> asList = Arrays.asList(new String[]{"Animation", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        this.f17682c.mo11944d(arrayList);
    }

    /* renamed from: a */
    public final List mo12438a() {
        List a = this.f17686g.mo11938a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new C5999r();
    }
}
