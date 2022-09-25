package com.google.android.libraries.home.p1958f.p1959a;

import androidx.preference.Preference;
import com.evernote.android.state.BuildConfig;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;
import p5462h.p5483m.C69762k;

/* renamed from: com.google.android.libraries.home.f.a.s */
/* compiled from: PG */
final class C23804s extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C69762k f65219a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23804s(C69762k kVar) {
        super(1);
        this.f65219a = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        Preference preference = (Preference) obj;
        C69664n.m101061g(preference, "it");
        C69762k kVar = this.f65219a;
        CharSequence charSequence = preference.f12745q;
        if (charSequence == null) {
            charSequence = BuildConfig.FLAVOR;
        }
        return Boolean.valueOf(kVar.f186139b.matcher(charSequence).find());
    }
}
