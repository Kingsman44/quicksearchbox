package android.support.p033v7.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.p034a.C0338a;
import android.support.p033v7.view.C0436d;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.customview.view.AbsSavedState;
import androidx.p106e.p107a.C2186c;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.googlequicksearchbox.R;
import java.util.WeakHashMap;

/* renamed from: android.support.v7.widget.SearchView */
/* compiled from: PG */
public class SearchView extends C0597dm implements C0436d {
    static final boolean DBG = false;
    private static final String IME_OPTION_NO_MICROPHONE = "nm";
    static final String LOG_TAG = "SearchView";
    static final C0703hk PRE_API_29_HIDDEN_METHOD_INVOKER = null;
    private Bundle mAppSearchData;
    private boolean mClearingFocus;
    final ImageView mCloseButton;
    private final ImageView mCollapsedIcon;
    private int mCollapsedImeOptions;
    private final CharSequence mDefaultQueryHint;
    private final View mDropDownAnchor;
    private boolean mExpandedInActionView;
    final ImageView mGoButton;
    private boolean mIconified;
    private boolean mIconifiedByDefault;
    private int mMaxWidth;
    private CharSequence mOldQueryText;
    private final View.OnClickListener mOnClickListener;
    private C0700hh mOnCloseListener;
    private final TextView.OnEditorActionListener mOnEditorActionListener;
    private final AdapterView.OnItemClickListener mOnItemClickListener;
    private final AdapterView.OnItemSelectedListener mOnItemSelectedListener;
    private C0701hi mOnQueryChangeListener;
    View.OnFocusChangeListener mOnQueryTextFocusChangeListener;
    private View.OnClickListener mOnSearchClickListener;
    private C0702hj mOnSuggestionListener;
    private final WeakHashMap mOutsideDrawablesCache;
    private CharSequence mQueryHint;
    private boolean mQueryRefinement;
    private Runnable mReleaseCursorRunnable;
    final ImageView mSearchButton;
    private final View mSearchEditFrame;
    private final Drawable mSearchHintIcon;
    private final View mSearchPlate;
    final SearchAutoComplete mSearchSrcTextView;
    private Rect mSearchSrcTextViewBounds;
    private Rect mSearchSrtTextViewBoundsExpanded;
    SearchableInfo mSearchable;
    private final View mSubmitArea;
    private boolean mSubmitButtonEnabled;
    private final int mSuggestionCommitIconResId;
    private final int mSuggestionRowLayout;
    C2186c mSuggestionsAdapter;
    private int[] mTemp;
    private int[] mTemp2;
    View.OnKeyListener mTextKeyListener;
    private TextWatcher mTextWatcher;
    private C0706hn mTouchDelegate;
    private final Runnable mUpdateDrawableStateRunnable;
    private CharSequence mUserQuery;
    private final Intent mVoiceAppSearchIntent;
    final ImageView mVoiceButton;
    private boolean mVoiceButtonEnabled;
    private final Intent mVoiceWebSearchIntent;

    /* renamed from: android.support.v7.widget.SearchView$SearchAutoComplete */
    /* compiled from: PG */
    public class SearchAutoComplete extends C0778x {

        /* renamed from: a */
        public SearchView f1833a;

        /* renamed from: b */
        public boolean f1834b;

        /* renamed from: c */
        final Runnable f1835c;

        /* renamed from: d */
        private int f1836d;

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo2307a() {
            C0699hg.m2395b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final void mo2308b(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1834b = false;
                removeCallbacks(this.f1835c);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1834b = false;
                removeCallbacks(this.f1835c);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1834b = true;
            }
        }

        public final boolean enoughToFilter() {
            return this.f1836d <= 0 || super.enoughToFilter();
        }

        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1834b) {
                removeCallbacks(this.f1835c);
                post(this.f1835c);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public final void onFinishInflate() {
            super.onFinishInflate();
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            setMinWidth((int) TypedValue.applyDimension(1, (float) ((i < 960 || configuration.screenHeightDp < 720 || configuration.orientation != 2) ? i < 600 ? 160 : 192 : 256), displayMetrics));
        }

        /* access modifiers changed from: protected */
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1833a.onTextFocusChanged();
        }

        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1833a.clearFocus();
                        mo2308b(false);
                        return true;
                    }
                }
                i = 4;
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1833a.hasFocus() && getVisibility() == 0) {
                this.f1834b = true;
                if (SearchView.isLandscapeMode(getContext())) {
                    mo2307a();
                }
            }
        }

        public final void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public final void replaceText(CharSequence charSequence) {
        }

        public final void setThreshold(int i) {
            super.setThreshold(i);
            this.f1836d = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1835c = new C0705hm(this);
            this.f1836d = getThreshold();
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private Intent createIntent(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.mUserQuery);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.mAppSearchData;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.mSearchable.getSearchActivity());
        return intent;
    }

    private Intent createIntentFromSuggestion(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String c;
        try {
            String c2 = C0727ih.m2449c(cursor, "suggest_intent_action");
            if (c2 == null) {
                c2 = this.mSearchable.getSuggestIntentAction();
            }
            if (c2 == null) {
                c2 = "android.intent.action.SEARCH";
            }
            String str2 = c2;
            String c3 = C0727ih.m2449c(cursor, "suggest_intent_data");
            if (c3 == null) {
                c3 = this.mSearchable.getSuggestIntentData();
            }
            if (!(c3 == null || (c = C0727ih.m2449c(cursor, "suggest_intent_data_id")) == null)) {
                c3 = c3 + "/" + Uri.encode(c);
            }
            if (c3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(c3);
            }
            return createIntent(str2, uri, C0727ih.m2449c(cursor, "suggest_intent_extra_data"), C0727ih.m2449c(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w(LOG_TAG, "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    private Intent createVoiceAppSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.mAppSearchData;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent createVoiceWebSearchIntent(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    private void dismissSuggestions() {
        this.mSearchSrcTextView.dismissDropDown();
    }

    private void getChildBoundsWithinSearchView(View view, Rect rect) {
        view.getLocationInWindow(this.mTemp);
        getLocationInWindow(this.mTemp2);
        int[] iArr = this.mTemp;
        int i = iArr[1];
        int[] iArr2 = this.mTemp2;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    private CharSequence getDecoratedHint(CharSequence charSequence) {
        if (!this.mIconifiedByDefault || this.mSearchHintIcon == null) {
            return charSequence;
        }
        double textSize = (double) this.mSearchSrcTextView.getTextSize();
        Double.isNaN(textSize);
        int i = (int) (textSize * 1.25d);
        this.mSearchHintIcon.setBounds(0, 0, i, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.mSearchHintIcon), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private boolean hasVoiceSearch() {
        Intent intent;
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.mSearchable.getVoiceSearchLaunchWebSearch()) {
                intent = this.mVoiceWebSearchIntent;
            } else {
                intent = this.mSearchable.getVoiceSearchLaunchRecognizer() ? this.mVoiceAppSearchIntent : null;
            }
            if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
                return false;
            }
            return true;
        }
        return false;
    }

    static boolean isLandscapeMode(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean isSubmitAreaEnabled() {
        return (this.mSubmitButtonEnabled || this.mVoiceButtonEnabled) && !isIconified();
    }

    private void launchIntent(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                new StringBuilder("Failed launch activity: ").append(intent);
                Log.e(LOG_TAG, "Failed launch activity: ".concat(intent.toString()), e);
            }
        }
    }

    private boolean launchSuggestion(int i, int i2, String str) {
        Cursor cursor = this.mSuggestionsAdapter.f6203d;
        if (cursor == null || !cursor.moveToPosition(i)) {
            return false;
        }
        launchIntent(createIntentFromSuggestion(cursor, i2, str));
        return true;
    }

    private void postUpdateFocusedState() {
        post(this.mUpdateDrawableStateRunnable);
    }

    private void rewriteQueryFromSuggestion(int i) {
        Editable text = this.mSearchSrcTextView.getText();
        Cursor cursor = this.mSuggestionsAdapter.f6203d;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                CharSequence b = this.mSuggestionsAdapter.mo3227b(cursor);
                if (b != null) {
                    setQuery(b);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    private void setQuery(CharSequence charSequence) {
        this.mSearchSrcTextView.setText(charSequence);
        this.mSearchSrcTextView.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private void updateCloseButton() {
        int[] iArr;
        boolean z = !TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        int i = 0;
        boolean z2 = z || (this.mIconifiedByDefault && !this.mExpandedInActionView);
        ImageView imageView = this.mCloseButton;
        if (true != z2) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.mCloseButton.getDrawable();
        if (drawable != null) {
            if (z) {
                iArr = ENABLED_STATE_SET;
            } else {
                iArr = EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void updateQueryHint() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
        if (queryHint == null) {
            queryHint = BuildConfig.FLAVOR;
        }
        searchAutoComplete.setHint(getDecoratedHint(queryHint));
    }

    private void updateSearchAutoComplete() {
        this.mSearchSrcTextView.setThreshold(this.mSearchable.getSuggestThreshold());
        this.mSearchSrcTextView.setImeOptions(this.mSearchable.getImeOptions());
        int inputType = this.mSearchable.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.mSearchable.getSuggestAuthority() != null) {
                inputType |= C89885b.WEB_APP_VALUE;
            }
        }
        this.mSearchSrcTextView.setInputType(inputType);
        C2186c cVar = this.mSuggestionsAdapter;
        if (cVar != null) {
            cVar.mo3228d((Cursor) null);
        }
        if (this.mSearchable.getSuggestAuthority() != null) {
            C0727ih ihVar = new C0727ih(getContext(), this, this.mSearchable, this.mOutsideDrawablesCache);
            this.mSuggestionsAdapter = ihVar;
            this.mSearchSrcTextView.setAdapter(ihVar);
            C0727ih ihVar2 = (C0727ih) this.mSuggestionsAdapter;
            if (true == this.mQueryRefinement) {
                i = 2;
            }
            ihVar2.f2571a = i;
        }
    }

    private void updateSubmitArea() {
        int i = 8;
        if (isSubmitAreaEnabled() && (this.mGoButton.getVisibility() == 0 || this.mVoiceButton.getVisibility() == 0)) {
            i = 0;
        }
        this.mSubmitArea.setVisibility(i);
    }

    private void updateSubmitButton(boolean z) {
        int i = 8;
        if (this.mSubmitButtonEnabled && isSubmitAreaEnabled() && hasFocus() && (z || !this.mVoiceButtonEnabled)) {
            i = 0;
        }
        this.mGoButton.setVisibility(i);
    }

    private void updateViewsVisibility(boolean z) {
        this.mIconified = z;
        int i = 0;
        int i2 = true != z ? 8 : 0;
        boolean isEmpty = TextUtils.isEmpty(this.mSearchSrcTextView.getText());
        this.mSearchButton.setVisibility(i2);
        updateSubmitButton(!isEmpty);
        this.mSearchEditFrame.setVisibility(true != z ? 0 : 8);
        if (this.mCollapsedIcon.getDrawable() == null || this.mIconifiedByDefault) {
            i = 8;
        }
        this.mCollapsedIcon.setVisibility(i);
        updateCloseButton();
        updateVoiceButton(isEmpty);
        updateSubmitArea();
    }

    private void updateVoiceButton(boolean z) {
        int i = 8;
        if (this.mVoiceButtonEnabled && !isIconified() && z) {
            this.mGoButton.setVisibility(8);
            i = 0;
        }
        this.mVoiceButton.setVisibility(i);
    }

    public void adjustDropDownSizeAndPosition() {
        int i;
        if (this.mDropDownAnchor.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.mSearchPlate.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0763jq.m2570b(this);
            int dimensionPixelSize = this.mIconifiedByDefault ? resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) : 0;
            this.mSearchSrcTextView.getDropDownBackground().getPadding(rect);
            if (b) {
                i = -rect.left;
            } else {
                i = paddingLeft - (rect.left + dimensionPixelSize);
            }
            this.mSearchSrcTextView.setDropDownHorizontalOffset(i);
            this.mSearchSrcTextView.setDropDownWidth((((this.mDropDownAnchor.getWidth() + rect.left) + rect.right) + dimensionPixelSize) - paddingLeft);
        }
    }

    public void clearFocus() {
        this.mClearingFocus = true;
        super.clearFocus();
        this.mSearchSrcTextView.clearFocus();
        this.mSearchSrcTextView.mo2308b(false);
        this.mClearingFocus = false;
    }

    public void forceSuggestionQuery() {
        C0699hg.m2394a(this.mSearchSrcTextView);
    }

    public int getImeOptions() {
        return this.mSearchSrcTextView.getImeOptions();
    }

    public int getInputType() {
        return this.mSearchSrcTextView.getInputType();
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public CharSequence getQuery() {
        return this.mSearchSrcTextView.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.mQueryHint;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.mSearchable;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.mDefaultQueryHint : getContext().getText(this.mSearchable.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.mSuggestionCommitIconResId;
    }

    public int getSuggestionRowLayout() {
        return this.mSuggestionRowLayout;
    }

    public C2186c getSuggestionsAdapter() {
        return this.mSuggestionsAdapter;
    }

    public boolean isIconfiedByDefault() {
        return this.mIconifiedByDefault;
    }

    public boolean isIconified() {
        return this.mIconified;
    }

    public boolean isQueryRefinementEnabled() {
        return this.mQueryRefinement;
    }

    public boolean isSubmitButtonEnabled() {
        return this.mSubmitButtonEnabled;
    }

    public void launchQuerySearch(int i, String str, String str2) {
        getContext().startActivity(createIntent("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    public void onActionViewCollapsed() {
        setQuery(BuildConfig.FLAVOR, false);
        clearFocus();
        updateViewsVisibility(true);
        this.mSearchSrcTextView.setImeOptions(this.mCollapsedImeOptions);
        this.mExpandedInActionView = false;
    }

    public void onActionViewExpanded() {
        if (!this.mExpandedInActionView) {
            this.mExpandedInActionView = true;
            int imeOptions = this.mSearchSrcTextView.getImeOptions();
            this.mCollapsedImeOptions = imeOptions;
            this.mSearchSrcTextView.setImeOptions(imeOptions | 33554432);
            this.mSearchSrcTextView.setText(BuildConfig.FLAVOR);
            setIconified(false);
        }
    }

    public void onCloseClicked() {
        if (!TextUtils.isEmpty(this.mSearchSrcTextView.getText())) {
            this.mSearchSrcTextView.setText(BuildConfig.FLAVOR);
            this.mSearchSrcTextView.requestFocus();
            this.mSearchSrcTextView.mo2308b(true);
        } else if (this.mIconifiedByDefault) {
            C0700hh hhVar = this.mOnCloseListener;
            if (hhVar == null || !hhVar.mo3185a()) {
                clearFocus();
                updateViewsVisibility(true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.mUpdateDrawableStateRunnable);
        post(this.mReleaseCursorRunnable);
        super.onDetachedFromWindow();
    }

    public boolean onItemClicked(int i, int i2, String str) {
        C0702hj hjVar = this.mOnSuggestionListener;
        if (hjVar != null && hjVar.mo3188a()) {
            return false;
        }
        launchSuggestion(i, 0, (String) null);
        this.mSearchSrcTextView.mo2308b(false);
        dismissSuggestions();
        return true;
    }

    public boolean onItemSelected(int i) {
        C0702hj hjVar = this.mOnSuggestionListener;
        if (hjVar != null && hjVar.mo3189b()) {
            return false;
        }
        rewriteQueryFromSuggestion(i);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            getChildBoundsWithinSearchView(this.mSearchSrcTextView, this.mSearchSrcTextViewBounds);
            this.mSearchSrtTextViewBoundsExpanded.set(this.mSearchSrcTextViewBounds.left, 0, this.mSearchSrcTextViewBounds.right, i4 - i2);
            C0706hn hnVar = this.mTouchDelegate;
            if (hnVar == null) {
                C0706hn hnVar2 = new C0706hn(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds, this.mSearchSrcTextView);
                this.mTouchDelegate = hnVar2;
                setTouchDelegate(hnVar2);
                return;
            }
            hnVar.mo3194a(this.mSearchSrtTextViewBoundsExpanded, this.mSearchSrcTextViewBounds);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (isIconified()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.mMaxWidth;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.mMaxWidth;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.mMaxWidth) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onQueryRefine(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f6116d);
        updateViewsVisibility(savedState.f1832a);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1832a = isIconified();
        return savedState;
    }

    public void onSearchClicked() {
        updateViewsVisibility(false);
        this.mSearchSrcTextView.requestFocus();
        this.mSearchSrcTextView.mo2308b(true);
        View.OnClickListener onClickListener = this.mOnSearchClickListener;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void onSubmitQuery() {
        Editable text = this.mSearchSrcTextView.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            C0701hi hiVar = this.mOnQueryChangeListener;
            if (hiVar == null || !hiVar.mo3187b(text.toString())) {
                if (this.mSearchable != null) {
                    launchQuerySearch(0, (String) null, text.toString());
                }
                this.mSearchSrcTextView.mo2308b(false);
                dismissSuggestions();
            }
        }
    }

    public boolean onSuggestionsKey(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.mSearchable != null && this.mSuggestionsAdapter != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return onItemClicked(this.mSearchSrcTextView.getListSelection(), 0, (String) null);
            }
            if (i == 21) {
                i2 = 0;
            } else if (i == 22) {
                i2 = this.mSearchSrcTextView.length();
            } else if (i == 19) {
                this.mSearchSrcTextView.getListSelection();
                return false;
            }
            this.mSearchSrcTextView.setSelection(i2);
            this.mSearchSrcTextView.setListSelection(0);
            this.mSearchSrcTextView.clearListSelection();
            this.mSearchSrcTextView.mo2307a();
            return true;
        }
        return false;
    }

    public void onTextChanged(CharSequence charSequence) {
        Editable text = this.mSearchSrcTextView.getText();
        this.mUserQuery = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        updateSubmitButton(!isEmpty);
        updateVoiceButton(isEmpty);
        updateCloseButton();
        updateSubmitArea();
        if (this.mOnQueryChangeListener != null && !TextUtils.equals(charSequence, this.mOldQueryText)) {
            this.mOnQueryChangeListener.mo3186a(charSequence.toString());
        }
        this.mOldQueryText = charSequence.toString();
    }

    public void onTextFocusChanged() {
        updateViewsVisibility(isIconified());
        postUpdateFocusedState();
        if (this.mSearchSrcTextView.hasFocus()) {
            forceSuggestionQuery();
        }
    }

    public void onVoiceClicked() {
        SearchableInfo searchableInfo = this.mSearchable;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(createVoiceWebSearchIntent(this.mVoiceWebSearchIntent, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(createVoiceAppSearchIntent(this.mVoiceAppSearchIntent, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w(LOG_TAG, "Could not find voice search activity");
            }
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        postUpdateFocusedState();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.mClearingFocus || !isFocusable()) {
            return false;
        }
        if (isIconified()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.mSearchSrcTextView.requestFocus(i, rect);
        if (requestFocus) {
            updateViewsVisibility(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.mAppSearchData = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            onCloseClicked();
        } else {
            onSearchClicked();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.mIconifiedByDefault != z) {
            this.mIconifiedByDefault = z;
            updateViewsVisibility(z);
            updateQueryHint();
        }
    }

    public void setImeOptions(int i) {
        this.mSearchSrcTextView.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.mSearchSrcTextView.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
        requestLayout();
    }

    public void setOnCloseListener(C0700hh hhVar) {
        this.mOnCloseListener = hhVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.mOnQueryTextFocusChangeListener = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0701hi hiVar) {
        this.mOnQueryChangeListener = hiVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.mOnSearchClickListener = onClickListener;
    }

    public void setOnSuggestionListener(C0702hj hjVar) {
        this.mOnSuggestionListener = hjVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.mQueryHint = charSequence;
        updateQueryHint();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.mQueryRefinement = z;
        C2186c cVar = this.mSuggestionsAdapter;
        if (cVar instanceof C0727ih) {
            C0727ih ihVar = (C0727ih) cVar;
            int i = 1;
            if (true == z) {
                i = 2;
            }
            ihVar.f2571a = i;
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.mSearchable = searchableInfo;
        if (searchableInfo != null) {
            updateSearchAutoComplete();
            updateQueryHint();
        }
        boolean hasVoiceSearch = hasVoiceSearch();
        this.mVoiceButtonEnabled = hasVoiceSearch;
        if (hasVoiceSearch) {
            this.mSearchSrcTextView.setPrivateImeOptions(IME_OPTION_NO_MICROPHONE);
        }
        updateViewsVisibility(isIconified());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.mSubmitButtonEnabled = z;
        updateViewsVisibility(isIconified());
    }

    public void setSuggestionsAdapter(C2186c cVar) {
        this.mSuggestionsAdapter = cVar;
        this.mSearchSrcTextView.setAdapter(cVar);
    }

    public void updateFocusedState() {
        int[] iArr;
        if (this.mSearchSrcTextView.hasFocus()) {
            iArr = FOCUSED_STATE_SET;
        } else {
            iArr = EMPTY_STATE_SET;
        }
        Drawable background = this.mSearchPlate.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.mSubmitArea.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    /* renamed from: android.support.v7.widget.SearchView$SavedState */
    /* compiled from: PG */
    class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C0704hl();

        /* renamed from: a */
        boolean f1832a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1832a = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1832a + "}";
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f6116d, i);
            parcel.writeValue(Boolean.valueOf(this.f1832a));
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.searchViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mSearchSrcTextViewBounds = new Rect();
        this.mSearchSrtTextViewBoundsExpanded = new Rect();
        this.mTemp = new int[2];
        this.mTemp2 = new int[2];
        this.mUpdateDrawableStateRunnable = new C0689gx(this);
        this.mReleaseCursorRunnable = new C0690gy(this);
        this.mOutsideDrawablesCache = new WeakHashMap();
        C0694hb hbVar = new C0694hb(this);
        this.mOnClickListener = hbVar;
        this.mTextKeyListener = new C0695hc(this);
        C0696hd hdVar = new C0696hd(this);
        this.mOnEditorActionListener = hdVar;
        C0697he heVar = new C0697he(this);
        this.mOnItemClickListener = heVar;
        C0698hf hfVar = new C0698hf(this);
        this.mOnItemSelectedListener = hfVar;
        this.mTextWatcher = new C0688gw(this);
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C0735ip f = C0735ip.m2473f(context, attributeSet2, C0338a.f1086v, i2, 0);
        C2043bi.m5525S(this, context, C0338a.f1086v, attributeSet2, f.f2596b, i2, 0);
        LayoutInflater.from(context).inflate(f.f2596b.getResourceId(17, R.layout.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.mSearchSrcTextView = searchAutoComplete;
        searchAutoComplete.f1833a = this;
        this.mSearchEditFrame = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.mSearchPlate = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.mSubmitArea = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.mSearchButton = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.mGoButton = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.mCloseButton = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.mVoiceButton = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.mCollapsedIcon = imageView5;
        C2043bi.m5530X(findViewById, f.mo3246b(18));
        C2043bi.m5530X(findViewById2, f.mo3246b(23));
        imageView.setImageDrawable(f.mo3246b(21));
        imageView2.setImageDrawable(f.mo3246b(13));
        imageView3.setImageDrawable(f.mo3246b(10));
        imageView4.setImageDrawable(f.mo3246b(26));
        imageView5.setImageDrawable(f.mo3246b(21));
        this.mSearchHintIcon = f.mo3246b(20);
        C0751je.m2535a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.mSuggestionRowLayout = f.f2596b.getResourceId(24, R.layout.abc_search_dropdown_item_icons_2line);
        this.mSuggestionCommitIconResId = f.f2596b.getResourceId(11, 0);
        imageView.setOnClickListener(hbVar);
        imageView3.setOnClickListener(hbVar);
        imageView2.setOnClickListener(hbVar);
        imageView4.setOnClickListener(hbVar);
        searchAutoComplete.setOnClickListener(hbVar);
        searchAutoComplete.addTextChangedListener(this.mTextWatcher);
        searchAutoComplete.setOnEditorActionListener(hdVar);
        searchAutoComplete.setOnItemClickListener(heVar);
        searchAutoComplete.setOnItemSelectedListener(hfVar);
        searchAutoComplete.setOnKeyListener(this.mTextKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new C0691gz(this));
        setIconifiedByDefault(f.f2596b.getBoolean(16, true));
        int dimensionPixelSize = f.f2596b.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.mDefaultQueryHint = f.f2596b.getText(12);
        this.mQueryHint = f.f2596b.getText(19);
        int i3 = f.f2596b.getInt(6, -1);
        if (i3 != -1) {
            setImeOptions(i3);
        }
        int i4 = f.f2596b.getInt(5, -1);
        if (i4 != -1) {
            setInputType(i4);
        }
        setFocusable(f.f2596b.getBoolean(1, true));
        f.f2596b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.mVoiceWebSearchIntent = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.mVoiceAppSearchIntent = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.mDropDownAnchor = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0693ha(this));
        }
        updateViewsVisibility(this.mIconifiedByDefault);
        updateQueryHint();
    }

    public void setQuery(CharSequence charSequence, boolean z) {
        this.mSearchSrcTextView.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.mSearchSrcTextView;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.mUserQuery = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            onSubmitQuery();
        }
    }
}
