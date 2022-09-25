package android.p017a.p019b;

import com.evernote.android.state.BuildConfig;

@Deprecated
/* renamed from: android.a.b.n */
/* compiled from: PG */
public final class C0100n {
    @Deprecated

    /* renamed from: a */
    public final C0099m f275a;
    @Deprecated

    /* renamed from: b */
    public final C0099m f276b;

    @Deprecated
    public C0100n(C0099m mVar, C0099m mVar2) {
        if (mVar.f269b == mVar2.f269b) {
            this.f275a = mVar;
            this.f276b = mVar2;
            return;
        }
        String obj = mVar.toString();
        String obj2 = mVar2.toString();
        throw new IllegalArgumentException("Ranges must have the same number of visible decimals: " + obj + "~" + obj2);
    }

    @Deprecated
    public final String toString() {
        String obj = this.f275a.toString();
        C0099m mVar = this.f276b;
        return obj.concat(mVar == this.f275a ? BuildConfig.FLAVOR : "~".concat(mVar.toString()));
    }
}
