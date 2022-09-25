package com.google.android.apps.gsa.searchplate;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.searchplate.p6963a.C88891a;
import com.google.android.apps.gsa.searchplate.p6963a.C88892b;
import com.google.android.apps.gsa.searchplate.p6963a.C88893c;
import com.google.android.apps.gsa.searchplate.p6966d.C88931c;
import com.google.android.apps.gsa.searchplate.p6966d.C88934f;
import com.google.android.apps.gsa.searchplate.p6966d.C88935g;
import com.google.android.apps.gsa.searchplate.p6966d.C88936h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4575r.C60757n;

/* compiled from: PG */
public class SimpleSearchText extends EditText {

    /* renamed from: a */
    CharSequence f240754a;

    /* renamed from: b */
    boolean f240755b = false;

    /* renamed from: c */
    public boolean f240756c;

    /* renamed from: d */
    public C88892b f240757d = new C88891a();

    /* renamed from: e */
    public final C88935g f240758e;

    /* renamed from: f */
    public C88984y f240759f;

    /* renamed from: g */
    public C88908aj f240760g = new C88908aj(this);

    /* renamed from: h */
    private boolean f240761h;

    /* renamed from: i */
    private boolean f240762i = true;

    /* renamed from: j */
    private boolean f240763j;

    /* renamed from: k */
    private CharSequence f240764k;

    public SimpleSearchText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f240758e = new C88935g(new C88931c(context), this.f240760g);
        this.f240764k = context.getString(R.string.search_box_hint);
    }

    /* renamed from: i */
    private final void m144387i() {
        CharSequence charSequence = TextUtils.isEmpty(getText()) ? this.f240762i ? this.f240764k : BuildConfig.FLAVOR : null;
        CharSequence hint = getHint();
        if (hint == charSequence) {
            return;
        }
        if (hint == null || charSequence == null || !hint.toString().contentEquals(charSequence)) {
            setHint(charSequence);
        }
    }

    /* renamed from: a */
    public final void mo82696a() {
        mo82698c(new C88936h(BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, 0));
    }

    /* renamed from: b */
    public final void mo82697b(String str) {
        if (str == null) {
            this.f240764k = getContext().getString(R.string.search_box_hint);
        } else {
            this.f240764k = str;
        }
        m144387i();
    }

    /* renamed from: c */
    public final void mo82698c(C88936h hVar) {
        this.f240754a = hVar.f240924b;
        if (!TextUtils.equals(getText(), this.f240754a)) {
            this.f240755b = true;
            setText(this.f240754a);
            this.f240755b = false;
        }
    }

    /* renamed from: d */
    public final void mo82699d(Spanned spanned) {
        this.f240757d.mo82153a(spanned, getText());
    }

    /* renamed from: e */
    public final void mo82700e() {
        if (this.f240756c) {
            this.f240755b = true;
            setSingleLine(true);
            this.f240762i = true;
            m144387i();
            setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.search_bar_text_size));
            Editable text = getText();
            setText(this.f240754a);
            mo82699d(text);
            this.f240757d.mo82154b(this);
            this.f240755b = false;
            this.f240756c = false;
        }
    }

    /* renamed from: f */
    public final void mo82701f() {
        if (!this.f240756c) {
            this.f240755b = true;
            setSingleLine(false);
            this.f240762i = false;
            m144387i();
            setLines(getResources().getInteger(R.integer.max_lines_for_voice_search_mode_search));
            setTextSize(0, (float) getResources().getDimensionPixelSize(R.dimen.voice_results_text_size));
            this.f240757d.mo82158f();
            this.f240755b = false;
            this.f240756c = true;
        }
    }

    /* renamed from: g */
    public final boolean mo82702g() {
        if (hasFocus() && !TextUtils.isEmpty(getText())) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo82703h() {
        return !this.f240761h && !isInTouchMode() && hasFocus();
    }

    public final void onBeginBatchEdit() {
        super.onBeginBatchEdit();
        C88935g gVar = this.f240758e;
        boolean hasSelection = hasSelection();
        C88934f fVar = gVar.f240919a;
        if (fVar == null) {
            gVar.f240919a = new C88934f();
            fVar = gVar.f240919a;
            fVar.f240913b = hasSelection;
        }
        fVar.f240912a++;
    }

    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        C88944g gVar = null;
        if (onCreateInputConnection != null) {
            C88935g gVar2 = this.f240758e;
            gVar2.f240919a = null;
            gVar2.mo82815a(true);
            gVar = new C88944g(onCreateInputConnection, this);
        }
        editorInfo.imeOptions &= -1073742080;
        editorInfo.imeOptions |= 33554435;
        return gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onEndBatchEdit() {
        /*
            r9 = this;
            super.onEndBatchEdit()
            com.google.android.apps.gsa.searchplate.d.g r0 = r9.f240758e
            android.text.Editable r1 = r9.getEditableText()
            com.google.android.apps.gsa.searchplate.d.f r2 = r0.f240919a
            if (r2 == 0) goto L_0x00b7
            int r3 = r2.f240912a
            int r3 = r3 + -1
            r2.f240912a = r3
            if (r3 == 0) goto L_0x0017
            goto L_0x00b7
        L_0x0017:
            boolean r3 = r2.mo82814b()
            if (r3 == 0) goto L_0x00b7
            java.lang.CharSequence r3 = r2.f240916e
            r3.getClass()
            int r4 = r2.f240918g
            int r5 = r4 + -1
            r6 = 0
            if (r4 == 0) goto L_0x00b6
            r7 = 1
            r8 = 3
            if (r5 == r7) goto L_0x008e
            r7 = 2
            if (r5 == r7) goto L_0x0085
            if (r5 == r8) goto L_0x0068
            r4 = 4
            if (r5 == r4) goto L_0x004d
            r2 = 5
            if (r5 == r2) goto L_0x0039
            goto L_0x0099
        L_0x0039:
            com.google.android.apps.gsa.searchplate.aj r2 = r0.f240920b
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r2.f240857a
            com.google.android.apps.gsa.searchplate.y r2 = r2.f240759f
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.gsa.searchplate.SearchPlate r2 = r2.f241143a
            com.google.android.apps.gsa.searchplate.a.c r2 = r2.f240752y
            if (r2 == 0) goto L_0x0099
            r2.mo17646p()
            goto L_0x0099
        L_0x004d:
            boolean r2 = r2.f240914c
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.gsa.searchplate.aj r2 = r0.f240920b
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.gsa.searchplate.p6966d.C88935g.m144539d(r3)
            com.google.android.apps.gsa.searchplate.SimpleSearchText r2 = r2.f240857a
            com.google.android.apps.gsa.searchplate.y r2 = r2.f240759f
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.gsa.searchplate.SearchPlate r2 = r2.f241143a
            com.google.android.apps.gsa.searchplate.a.c r2 = r2.f240752y
            if (r2 == 0) goto L_0x0099
            r2.mo17647q()
            goto L_0x0099
        L_0x0068:
            boolean r4 = com.google.android.apps.gsa.searchplate.p6966d.C88935g.m144540e(r1)
            if (r4 == 0) goto L_0x007a
            int r2 = r2.f240918g
            boolean r2 = com.google.android.apps.gsa.searchplate.p6966d.C88933e.m144535a(r2)
            com.google.android.apps.gsa.searchplate.d.d r4 = com.google.android.apps.gsa.searchplate.p6966d.C88932d.SUGGESTION
            r0.mo82816b(r3, r2, r4)
            goto L_0x0099
        L_0x007a:
            com.google.android.apps.gsa.searchplate.aj r2 = r0.f240920b
            if (r2 == 0) goto L_0x0099
            com.google.android.apps.gsa.searchplate.p6966d.C88935g.m144539d(r3)
            r2.mo82786a()
            goto L_0x0099
        L_0x0085:
            boolean r4 = com.google.android.apps.gsa.searchplate.p6966d.C88933e.m144535a(r4)
            com.google.android.apps.gsa.searchplate.d.d r2 = r2.mo82813a()
            goto L_0x0096
        L_0x008e:
            boolean r4 = com.google.android.apps.gsa.searchplate.p6966d.C88933e.m144535a(r4)
            com.google.android.apps.gsa.searchplate.d.d r2 = r2.mo82813a()
        L_0x0096:
            r0.mo82816b(r3, r4, r2)
        L_0x0099:
            boolean r1 = com.google.android.apps.gsa.searchplate.p6966d.C88935g.m144540e(r1)
            com.google.android.apps.gsa.searchplate.d.f r2 = r0.f240919a
            if (r2 == 0) goto L_0x00b7
            int r2 = r2.f240918g
            if (r2 != r8) goto L_0x00b3
            if (r1 == 0) goto L_0x00b3
            com.google.android.apps.gsa.searchplate.d.f r1 = new com.google.android.apps.gsa.searchplate.d.f
            r1.<init>()
            r0.f240919a = r1
            com.google.android.apps.gsa.searchplate.d.f r0 = r0.f240919a
            r0.f240918g = r8
            return
        L_0x00b3:
            r0.f240919a = r6
            return
        L_0x00b6:
            throw r6
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.searchplate.SimpleSearchText.onEndBatchEdit():void");
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        m144387i();
        setAccessibilityDelegate(new C88909ak());
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        C88893c cVar;
        super.onFocusChanged(z, i, rect);
        if (z) {
            this.f240761h = isInTouchMode();
            C88984y yVar = this.f240759f;
            if (!(yVar == null || !yVar.f241143a.f240735h.mo82703h() || (cVar = yVar.f241143a.f240752y) == null)) {
                cVar.mo17636f();
            }
            this.f240758e.mo82815a(false);
        } else if (this.f240763j) {
            this.f240755b = true;
            setSelection(0, 0);
            mo82699d((Spanned) null);
            this.f240755b = false;
        }
        this.f240763j = z;
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.f240755b = true;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        CharSequence charSequence = savedState.f240765a;
        if (charSequence != null) {
            this.f240754a = charSequence;
        }
        CharSequence charSequence2 = savedState.f240768d;
        if (charSequence2 != null) {
            setPrivateImeOptions(charSequence2.toString());
        }
        C88892b bVar = this.f240757d;
        int i = savedState.f240766b;
        int i2 = savedState.f240767c;
        bVar.mo82157e();
        this.f240755b = false;
    }

    public final Parcelable onSaveInstanceState() {
        this.f240755b = true;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f240765a = this.f240754a;
        savedState.f240766b = getSelectionStart();
        savedState.f240767c = getSelectionEnd();
        savedState.f240768d = getPrivateImeOptions();
        this.f240755b = false;
        Parcel obtain = Parcel.obtain();
        savedState.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        SavedState savedState2 = new SavedState(obtain);
        obtain.recycle();
        return savedState2;
    }

    /* access modifiers changed from: protected */
    public final void onSelectionChanged(int i, int i2) {
        C88893c cVar;
        super.onSelectionChanged(i, i2);
        if (i >= 0 && i2 >= 0 && !this.f240755b) {
            Editable text = getText();
            if (this.f240759f != null && text != null && this.f240757d.mo82156d() && (cVar = this.f240759f.f241143a.f240752y) != null) {
                cVar.mo17642l(text, i, i2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        C88984y yVar = this.f240759f;
        if (yVar != null && !this.f240755b) {
            int selectionStart = getSelectionStart();
            SearchPlate searchPlate = yVar.f241143a;
            C88893c cVar = searchPlate.f240752y;
            if (cVar != null) {
                searchPlate.f240735h.mo82703h();
                cVar.mo17649s(charSequence, selectionStart);
            }
        }
        setCursorVisible(true);
        m144387i();
    }

    public final boolean onTextContextMenuItem(int i) {
        int i2;
        if (i == 16908322) {
            ClipData primaryClip = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                StringBuilder sb = new StringBuilder();
                for (int i3 = 0; i3 < primaryClip.getItemCount(); i3++) {
                    sb.append(primaryClip.getItemAt(i3).coerceToText(getContext()));
                }
                Editable text = getText();
                int length = text.length();
                if (isFocused()) {
                    int selectionStart = getSelectionStart();
                    int selectionEnd = getSelectionEnd();
                    i2 = Math.max(0, Math.min(selectionStart, selectionEnd));
                    length = C60757n.m92746g(0, selectionStart, selectionEnd);
                } else {
                    i2 = 0;
                }
                if (text != null) {
                    Selection.setSelection(text, length);
                    text.replace(i2, length, sb.toString());
                    for (URLSpan removeSpan : (URLSpan[]) text.getSpans(0, text.length(), URLSpan.class)) {
                        text.removeSpan(removeSpan);
                    }
                }
                return true;
            }
            i = 16908322;
        }
        return super.onTextContextMenuItem(i);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            performClick();
        }
        if (this.f240757d.mo82155c(motionEvent, this) || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* compiled from: PG */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new C88910al();

        /* renamed from: a */
        CharSequence f240765a;

        /* renamed from: b */
        int f240766b;

        /* renamed from: c */
        int f240767c;

        /* renamed from: d */
        CharSequence f240768d;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f240765a = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f240766b = parcel.readInt();
            this.f240767c = parcel.readInt();
            this.f240768d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f240765a, parcel, i);
            parcel.writeInt(this.f240766b);
            parcel.writeInt(this.f240767c);
            TextUtils.writeToParcel(this.f240768d, parcel, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
