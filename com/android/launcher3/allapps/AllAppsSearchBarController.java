package com.android.launcher3.allapps;

import android.content.Intent;
import android.net.Uri;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.android.launcher3.AppInfo;
import com.android.launcher3.ExtendedEditText;
import com.android.launcher3.Launcher;
import com.android.launcher3.Utilities;
import com.android.launcher3.allapps.AllAppsSearchBarController;
import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import java.util.ArrayList;

/* compiled from: PG */
public class AllAppsSearchBarController implements TextWatcher, TextView.OnEditorActionListener, ExtendedEditText.OnBackKeyListener {
    protected AlphabeticalAppsList mApps;
    protected Callbacks mCb;
    protected ExtendedEditText mInput;
    protected InputMethodManager mInputMethodManager;
    protected Launcher mLauncher;
    protected DefaultAppSearchAlgorithm mSearchAlgorithm;

    /* compiled from: PG */
    public interface Callbacks {
        void clearSearchResult();

        void onSearchResult(String str, ArrayList arrayList);
    }

    public static final Intent createMarketSearchIntent$ar$ds(String str) {
        return new Intent("android.intent.action.VIEW").setData(Uri.parse("market://search").buildUpon().appendQueryParameter(C45240c.f118157a, "apps").appendQueryParameter("q", str).build());
    }

    public final void afterTextChanged(Editable editable) {
        String obj = editable.toString();
        if (obj.isEmpty()) {
            this.mSearchAlgorithm.mResultHandler.removeCallbacksAndMessages((Object) null);
            this.mCb.clearSearchResult();
            return;
        }
        DefaultAppSearchAlgorithm defaultAppSearchAlgorithm = this.mSearchAlgorithm;
        Callbacks callbacks = this.mCb;
        String[] split = DefaultAppSearchAlgorithm.SPLIT_PATTERN.split(obj.toLowerCase());
        ArrayList arrayList = new ArrayList();
        for (AppInfo appInfo : defaultAppSearchAlgorithm.mApps) {
            String[] split2 = DefaultAppSearchAlgorithm.SPLIT_PATTERN.split(appInfo.title.toString().toLowerCase());
            int i = 0;
            while (true) {
                if (i >= split.length) {
                    arrayList.add(appInfo.toComponentKey());
                    break;
                }
                int i2 = 0;
                while (i2 < split2.length) {
                    if (split2[i2].startsWith(split[i])) {
                        i++;
                    } else {
                        i2++;
                    }
                }
                break;
            }
        }
        defaultAppSearchAlgorithm.mResultHandler.post(new Runnable(obj, arrayList) {
            final /* synthetic */ String val$query;
            final /* synthetic */ ArrayList val$result;

            {
                this.val$query = r2;
                this.val$result = r3;
            }

            public final void run() {
                AllAppsSearchBarController.Callbacks.this.onSearchResult(this.val$query, this.val$result);
            }
        });
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void focusSearchField() {
        this.mInput.requestFocus();
        this.mInputMethodManager.showSoftInput(this.mInput, 1);
    }

    public final boolean onBackKey() {
        if (!Utilities.trim(this.mInput.getEditableText().toString()).isEmpty() && !this.mApps.hasNoFilteredResults()) {
            return false;
        }
        reset();
        return true;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 3) {
            return false;
        }
        String obj = textView.getText().toString();
        if (obj.isEmpty()) {
            return false;
        }
        return this.mLauncher.startActivitySafely(textView, createMarketSearchIntent$ar$ds(obj), (Object) null);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void reset() {
        View focusSearch = this.mInput.focusSearch(130);
        if (focusSearch != null) {
            focusSearch.requestFocus();
        }
        this.mCb.clearSearchResult();
        this.mInput.setText(BuildConfig.FLAVOR);
        this.mInputMethodManager.hideSoftInputFromWindow(this.mInput.getWindowToken(), 0);
    }
}
