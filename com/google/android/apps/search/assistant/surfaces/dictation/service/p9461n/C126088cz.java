package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.dictation.h;
import java.util.List;
import p5462h.p5463a.C69496am;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.cz */
/* compiled from: PG */
public final class C126088cz {

    /* renamed from: a */
    public final String f347500a;

    /* renamed from: b */
    public final String f347501b;

    /* renamed from: c */
    public final List f347502c;

    /* renamed from: d */
    public final h f347503d;

    /* renamed from: e */
    public final boolean f347504e;

    /* renamed from: f */
    public final boolean f347505f;

    public C126088cz() {
        this((byte[]) null);
    }

    public C126088cz(String str, String str2, List list, h hVar, boolean z, boolean z2) {
        C69664n.m101061g(str, "symbol");
        C69664n.m101061g(str2, "conceptId");
        C69664n.m101061g(list, "alternatives");
        C69664n.m101061g(hVar, "emojiIntentType");
        this.f347500a = str;
        this.f347501b = str2;
        this.f347502c = list;
        this.f347503d = hVar;
        this.f347504e = z;
        this.f347505f = z2;
    }

    public /* synthetic */ C126088cz(byte[] bArr) {
        this(BuildConfig.FLAVOR, BuildConfig.FLAVOR, C69496am.f185918a, h.a, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C126088cz)) {
            return false;
        }
        C126088cz czVar = (C126088cz) obj;
        return C69664n.m101066l(this.f347500a, czVar.f347500a) && C69664n.m101066l(this.f347501b, czVar.f347501b) && C69664n.m101066l(this.f347502c, czVar.f347502c) && this.f347503d == czVar.f347503d && this.f347504e == czVar.f347504e && this.f347505f == czVar.f347505f;
    }

    public final int hashCode() {
        return (((((((((this.f347500a.hashCode() * 31) + this.f347501b.hashCode()) * 31) + this.f347502c.hashCode()) * 31) + this.f347503d.hashCode()) * 31) + (this.f347504e ? 1 : 0)) * 31) + (this.f347505f ? 1 : 0);
    }

    public final String toString() {
        String str = this.f347500a;
        String str2 = this.f347501b;
        List list = this.f347502c;
        h hVar = this.f347503d;
        boolean z = this.f347504e;
        boolean z2 = this.f347505f;
        return "SpokenOrTappedEmoji(symbol=" + str + ", conceptId=" + str2 + ", alternatives=" + list + ", emojiIntentType=" + hVar + ", keyboardSuggestionIsSpeakable=" + z + ", keyboardSuggestionIsDisplayed=" + z2 + ")";
    }
}
