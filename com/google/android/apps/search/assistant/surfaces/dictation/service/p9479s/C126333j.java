package com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.C125065at;
import com.google.android.apps.search.assistant.surfaces.dictation.service.formatter.C125513s;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.s.j */
/* compiled from: PG */
public final class C126333j extends C126324be {

    /* renamed from: a */
    public final C125065at f348016a;

    /* renamed from: b */
    public final C125065at f348017b;

    /* renamed from: c */
    public final C125513s f348018c;

    /* renamed from: d */
    public final Optional f348019d;

    /* renamed from: e */
    public final Optional f348020e;

    /* renamed from: f */
    public final boolean f348021f;

    public C126333j(C125065at atVar, C125065at atVar2, C125513s sVar, Optional optional, Optional optional2, boolean z) {
        if (atVar != null) {
            this.f348016a = atVar;
            if (atVar2 != null) {
                this.f348017b = atVar2;
                if (sVar != null) {
                    this.f348018c = sVar;
                    if (optional != null) {
                        this.f348019d = optional;
                        if (optional2 != null) {
                            this.f348020e = optional2;
                            this.f348021f = z;
                            return;
                        }
                        throw new NullPointerException("Null currentlySuppressedTranscription");
                    }
                    throw new NullPointerException("Null currentlyPreviewedTranscription");
                }
                throw new NullPointerException("Null formattingState");
            }
            throw new NullPointerException("Null composingTextBeforePreviews");
        }
        throw new NullPointerException("Null composingText");
    }

    /* renamed from: a */
    public final C125065at mo107534a() {
        return this.f348016a;
    }

    /* renamed from: b */
    public final C125065at mo107535b() {
        return this.f348017b;
    }

    /* renamed from: c */
    public final C125513s mo107536c() {
        return this.f348018c;
    }

    /* renamed from: d */
    public final Optional mo107537d() {
        return this.f348019d;
    }

    /* renamed from: e */
    public final Optional mo107538e() {
        return this.f348020e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C126324be) {
            C126324be beVar = (C126324be) obj;
            return this.f348016a.equals(beVar.mo107534a()) && this.f348017b.equals(beVar.mo107535b()) && this.f348018c.equals(beVar.mo107536c()) && this.f348019d.equals(beVar.mo107537d()) && this.f348020e.equals(beVar.mo107538e()) && this.f348021f == beVar.mo107539f();
        }
    }

    /* renamed from: f */
    public final boolean mo107539f() {
        return this.f348021f;
    }

    public final int hashCode() {
        return ((((((((((this.f348016a.hashCode() ^ 1000003) * 1000003) ^ this.f348017b.hashCode()) * 1000003) ^ this.f348018c.hashCode()) * 1000003) ^ this.f348019d.hashCode()) * 1000003) ^ this.f348020e.hashCode()) * 1000003) ^ (true != this.f348021f ? 1237 : 1231);
    }

    public final String toString() {
        String obj = this.f348016a.toString();
        String obj2 = this.f348017b.toString();
        String obj3 = this.f348018c.toString();
        String obj4 = this.f348019d.toString();
        String obj5 = this.f348020e.toString();
        boolean z = this.f348021f;
        return "TextState{composingText=" + obj + ", composingTextBeforePreviews=" + obj2 + ", formattingState=" + obj3 + ", currentlyPreviewedTranscription=" + obj4 + ", currentlySuppressedTranscription=" + obj5 + ", textCurrentlySelected=" + z + "}";
    }
}
