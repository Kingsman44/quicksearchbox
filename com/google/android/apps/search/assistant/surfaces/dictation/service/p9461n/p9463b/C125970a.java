package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n.p9463b;

import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125040f;
import com.google.android.apps.search.assistant.surfaces.dictation.p9427a.p9428a.C125044j;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.b.a */
/* compiled from: PG */
public final class C125970a extends C126031g {

    /* renamed from: a */
    public String f347195a;

    /* renamed from: b */
    public String f347196b;

    /* renamed from: c */
    public int f347197c;

    /* renamed from: d */
    private C126030f f347198d;

    /* renamed from: e */
    private C125044j f347199e;

    /* renamed from: f */
    private C125040f f347200f;

    /* renamed from: a */
    public final C126032h mo107213a() {
        String str;
        int i;
        C126030f fVar;
        C125044j jVar;
        C125040f fVar2;
        String str2 = this.f347195a;
        if (str2 != null && (str = this.f347196b) != null && (i = this.f347197c) != 0 && (fVar = this.f347198d) != null && (jVar = this.f347199e) != null && (fVar2 = this.f347200f) != null) {
            return new C125987b(str2, str, i, fVar, jVar, fVar2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f347195a == null) {
            sb.append(" text");
        }
        if (this.f347196b == null) {
            sb.append(" description");
        }
        if (this.f347197c == 0) {
            sb.append(" suggestionType");
        }
        if (this.f347198d == null) {
            sb.append(" accessibilityBehavior");
        }
        if (this.f347199e == null) {
            sb.append(" chipId");
        }
        if (this.f347200f == null) {
            sb.append(" emojiSuggestion");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo107214b(C126030f fVar) {
        if (fVar != null) {
            this.f347198d = fVar;
            return;
        }
        throw new NullPointerException("Null accessibilityBehavior");
    }

    /* renamed from: c */
    public final void mo107215c(C125044j jVar) {
        if (jVar != null) {
            this.f347199e = jVar;
            return;
        }
        throw new NullPointerException("Null chipId");
    }

    /* renamed from: d */
    public final void mo107216d(String str) {
        if (str != null) {
            this.f347196b = str;
            return;
        }
        throw new NullPointerException("Null description");
    }

    /* renamed from: e */
    public final void mo107217e(C125040f fVar) {
        if (fVar != null) {
            this.f347200f = fVar;
            return;
        }
        throw new NullPointerException("Null emojiSuggestion");
    }

    /* renamed from: f */
    public final void mo107218f(String str) {
        if (str != null) {
            this.f347195a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
